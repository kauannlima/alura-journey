package br.com.alura.desafio;

public class Cartao {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public Cartao(int limite) {
        this.limite = limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
