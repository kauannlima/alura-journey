package br.com.alura.screenmatch.principal;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String APIKEY= "&apikey=1eb6954f";

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        //"https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=1eb6954f"
    }

}
