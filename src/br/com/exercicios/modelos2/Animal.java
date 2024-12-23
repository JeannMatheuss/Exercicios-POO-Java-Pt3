package br.com.exercicios.modelos2;

public class Animal {
    private String nome;
    private int idade;
    private String raca;
    private String cor;


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


    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }


    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void fichaDoAnimal() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Raça: " + getRaca());
        System.out.println("Cor: " + getCor());
    }

    public void emitirSom() {
        System.out.println("O animal está emitindo um som");
    }
}
