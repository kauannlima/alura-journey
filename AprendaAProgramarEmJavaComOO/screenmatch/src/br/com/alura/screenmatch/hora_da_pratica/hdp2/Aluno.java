package br.com.alura.screenmatch.hora_da_pratica.hdp2;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(double nota) {
        notas.add(nota);
    }

    public double calcularMedia(){
        double soma = 0.0;
        for (double nota: this.notas){
            soma += nota;
        }
       return soma / this.notas.size();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", notas=" + notas +
                '}';
    }
}
