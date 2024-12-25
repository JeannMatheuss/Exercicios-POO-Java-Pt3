package br.com.exercicios.modelos3;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo+=valor;
        System.out.println("Depósito de " + valor + "realizado. Saldo atual: " + saldo);
    }
}
