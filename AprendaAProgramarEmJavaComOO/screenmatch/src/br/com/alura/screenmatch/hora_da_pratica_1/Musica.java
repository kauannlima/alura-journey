package br.com.alura.screenmatch.hora_da_pratica_1;

public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
    }

    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calculaMedia(){
        return avaliacao / numAvaliacoes;
    }
}
