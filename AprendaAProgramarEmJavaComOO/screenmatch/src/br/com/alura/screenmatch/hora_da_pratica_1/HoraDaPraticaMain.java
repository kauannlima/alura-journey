package br.com.alura.screenmatch.hora_da_pratica_1;

public class HoraDaPraticaMain {

    public static void main(String[] args) {

        System.out.println("PESSOA");
        Pessoa pessoa = new Pessoa();
        pessoa.retornaOlaMundo();

        System.out.println("\nCALCULADORA");
        Calculadora calculadora = new Calculadora();
        System.out.println( calculadora.retornaDobro(2));

        System.out.println("\nMUSICA");
        Musica musica = new Musica();
        musica.titulo = "Novacane";
        musica.artista = "Frank Ocean";
        musica.anoDeLancamento = 2011;
        musica.avaliar(10);
        musica.avaliar(8);
        musica.avaliar(9);
        musica.exibirFichaTecnica();
        System.out.println(musica.calculaMedia());

        System.out.println("\nCARRO");
        Carro carro = new Carro();
        carro.modelo = "HB20";
        carro.ano = 2019;
        carro.cor = "cinza";
        carro.exibirFichaTecnica();
        System.out.println(carro.calculaIdadeCarro());

        System.out.println("\nALUNO");
        Aluno aluno = new Aluno();
        aluno.nome = "Kauan";
        aluno.idade = 21;
        aluno.exibeInformacoesAluno();

    }
}
