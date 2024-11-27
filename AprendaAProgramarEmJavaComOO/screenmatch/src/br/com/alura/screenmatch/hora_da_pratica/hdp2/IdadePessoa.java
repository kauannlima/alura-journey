package br.com.alura.screenmatch.hora_da_pratica.hdp2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
    String msg =   this.idade >= 18 ? "Maior de Idade" : "Menor de Idade";
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return "IdadePessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
