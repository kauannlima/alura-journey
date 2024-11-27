package br.com.alura.screenmatch.hora_da_pratica.hdp2;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
