package br.com.alura.desafio;

import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Compra> listaDeCompras = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcao = 1;
        System.out.println("Digite o limite do cartão");
        Cartao cartao = new Cartao(entrada.nextInt());
        entrada.nextLine();

        while (opcao != 0){

            System.out.println("Digite a descrição da compra: ");
            String descricaoCompra = entrada.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valorCompra = entrada.nextDouble();
            entrada.nextLine();

            if (valorCompra < cartao.getLimite()){
                Compra compra = new Compra(descricaoCompra, valorCompra);
                listaDeCompras.add(compra);
                cartao.setLimite(cartao.getLimite() - compra.getValCompra());
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = entrada.nextInt();
                entrada.nextLine();
            }else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }
        }
        System.out.println("*************************");
        System.out.println("COMPRAS REALIZADA:\n");
        listaDeCompras.sort(Comparator.comparing(Compra::getValCompra));
        for (Compra compra: listaDeCompras){
            System.out.println(compra.getDescCompra() + " - "+ compra.getValCompra());
        }
        System.out.println("\n*************************\n");
        System.out.println("Saldo do cartão: "+ cartao.getLimite());
    }
}
