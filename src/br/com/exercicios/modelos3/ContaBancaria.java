package br.com.exercicios.modelos3;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo+=valor;
        System.out.println("Depósito de " + valor + "realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo-=valor;
            System.out.println("Saque de " + valor + "realizado. Saldo atual: " + saldo);
        } 
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    

}
