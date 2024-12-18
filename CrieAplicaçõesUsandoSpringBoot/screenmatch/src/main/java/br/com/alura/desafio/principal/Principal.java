package br.com.alura.desafio.principal;

import br.com.alura.desafio.model.Dados;
import br.com.alura.desafio.model.DadosModelos;
import br.com.alura.desafio.model.DadosVeiculo;
import br.com.alura.desafio.service.ConverteDados;
import br.com.alura.desafio.service.ConsumoApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    String endereco;
    String veiculo;

    public void exibeMenu() {
        System.out.println("**** OPÇÕES ****");
        System.out.println("""
                Carro
                Moto
                Caminhão
                """);
        System.out.println("Digite uma das opções para consultar valores: ");

        var tipoVeiculo = leitura.nextLine();
        if (tipoVeiculo.toLowerCase().contains("car")) {
            veiculo = "carros";
        } else if (tipoVeiculo.contains("mot")) {
            veiculo = "motos";
        } else if (tipoVeiculo.contains("cam")) {
            veiculo = "caminhoes";
        }
        endereco = URL_BASE + veiculo + "/marcas";

        var json = consumo.obterDados(endereco);
        var marcas = conversor.obterLista(json, Dados.class);
        marcas.stream()
                .sorted(Comparator.comparing(Dados::getCodigo))
                .forEach(System.out::println);

        System.out.println("Informe o código da marca para consulta: ");
        var codMarca = leitura.nextLine();
        endereco = endereco + "/" + codMarca + "/modelos";
        json = consumo.obterDados(endereco);
        var modeloLista = conversor.obterDados(json, DadosModelos.class);

        System.out.println("\nModelos dessa marca: ");
        modeloLista.modelos().stream()
                .sorted(Comparator.comparing(Dados::getCodigo))
                .forEach(System.out::println);

        System.out.println("\nDigite um trecho do nome dos(as) " + veiculo + " a ser buscado(a)");
        var nomeVeiculo = leitura.nextLine();

        List<Dados> modelosFiltrados = modeloLista.modelos().stream()
                .filter(m -> m.getNome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println("\nModelos Filtrados");
        modelosFiltrados.forEach(System.out::println);

        System.out.println("Informe o código do modelo para buscar os valores de avaliaçãp: ");
        var codModelo = leitura.nextLine();
        endereco = endereco + "/" + codModelo + "/anos";
        json = consumo.obterDados(endereco);

        List<Dados> anos = conversor.obterLista(json, Dados.class);
        List<DadosVeiculo> veiculos = new ArrayList<>();

        for (int i = 0; i < anos.size(); i++) {
            var enderecoAnos = endereco + "/" + anos.get(i).getCodigo();
            json = consumo.obterDados(enderecoAnos);
            DadosVeiculo veiculo = conversor.obterDados(json, DadosVeiculo.class);
            veiculos.add(veiculo);
        }

        System.out.println("Todos os veículos filtrrados  avaliações por ano: ");
        veiculos.forEach(System.out::println);
    }
}