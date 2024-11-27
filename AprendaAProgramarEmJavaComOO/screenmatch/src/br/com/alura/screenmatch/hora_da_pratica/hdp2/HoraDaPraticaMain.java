package br.com.alura.screenmatch.hora_da_pratica.hdp2;

public class HoraDaPraticaMain {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(12345);
        conta.setSaldo(100.90);
        conta.titular = "Kauan";
        System.out.println(conta);

        System.out.println();

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setIdade(21);
        idadePessoa.setNome("Kauan");
        idadePessoa.verificarIdade();

        System.out.println();

        Produto produto = new Produto();
        produto.setNome("Caneta Azul");
        produto.setPreco(2.0);
        produto.aplicarDesconto(5);
        System.out.println(produto.getPreco());

        System.out.println();

        Aluno aluno = new Aluno();
        aluno.setNome("Kauan Lima");
        aluno.setNotas(9);
        aluno.setNotas(8);
        aluno.setNotas(7);
        System.out.println(aluno.calcularMedia());
    }
}
