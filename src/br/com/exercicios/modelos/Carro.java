package br.com.exercicios.modelos;

public class Carro {
    private String nomeDoModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;


    public String getNomeDoModelo() {
        return nomeDoModelo;
    }
    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }


    public double getPrecoAno1() {
        return precoAno1;
    }
    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }


    public double getPrecoAno2() {
        return precoAno2;
    }
    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }


    public double getPrecoAno3() {
        return precoAno3;
    }
    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }


    public void precosAoLongoDosAnos() {
        System.out.println("Preço do Carro em três anos");
        System.out.println("Preço do ano do lançamento (ano 1): R$ " + precoAno1);
        System.out.println("Preço do ano seguinte (ano 2): R$ " + precoAno2);
        System.out.println("Preço do ano seguinte (ano 3): R$ " + precoAno3);
    }

    // Metodos dos preços (maior e menor)
    public double getMaiorPreco() {
        double maior = precoAno1; // Assume que o primeiro preço é o maior
        if (precoAno2 > maior) {
            maior = precoAno2;
        }
        if (precoAno3 > maior) {
            maior = precoAno3;
        }
        return maior;
    }

    public double getMenorPreco() {
        double menor = precoAno1;
        if (precoAno2 < menor) {
            menor = precoAno2;
        }
        if (precoAno3 < menor) {
            menor = precoAno3;
        }
        return menor;
    }


}
