package br.com.alura.desafio;

public class Compra {

    private String descCompra;
    private double valCompra;

    public Compra(String descCompra, double valCompra) {
        this.descCompra = descCompra;
        this.valCompra = valCompra;
    }

    public String getDescCompra() {
        return descCompra;
    }

    public double getValCompra() {
        return valCompra;
    }
}
