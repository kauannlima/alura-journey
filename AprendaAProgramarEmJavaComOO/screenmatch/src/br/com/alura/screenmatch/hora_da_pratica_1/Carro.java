package br.com.alura.screenmatch.hora_da_pratica_1;

public class Carro {

    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
    }

    int calculaIdadeCarro(){
        return 2024 - ano;
    }


}
