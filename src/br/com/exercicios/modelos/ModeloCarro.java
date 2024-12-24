package br.com.exercicios.modelos;

public class ModeloCarro extends Carro {
    private String tipoDeCarro;
    private int anoDeFabricacao;
    private String tipoDeCor;
    private String tipoDePneu;
    private String tipoDeMotor;
    private String tipoDeCambio;
    private String tipoDeFreio;
    private String tipoDeSuspensao;


    public String getTipoDeCarro() {
        return tipoDeCarro;
    }

    public void setTipoDeCarro(String tipoDeCarro) {
        this.tipoDeCarro = tipoDeCarro;
    }

    public String getTipoDeCor() {
        return tipoDeCor;
    }

    public void setTipoDeCor(String tipoDeCor) {
        this.tipoDeCor = tipoDeCor;
    }

    public String getTipoDePneu() {
        return tipoDePneu;
    }

    public void setTipoDePneu(String tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public String getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(String tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public String getTipoDeFreio() {
        return tipoDeFreio;
    }

    public void setTipoDeFreio(String tipoDeFreio) {
        this.tipoDeFreio = tipoDeFreio;
    }

    public String getTipoDeSuspensao() {
        return tipoDeSuspensao;
    }

    public void setTipoDeSuspensao(String tipoDeSuspensao) {
        this.tipoDeSuspensao = tipoDeSuspensao;
    }
    
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void exibirFichaDoCarro() {
        System.out.println("Nome do Modelo: " + getNomeDoModelo());
        System.out.println("Ano de Fabricação: " + getAnoDeFabricacao());
        System.out.println("Tipo de Carro" + getTipoDeCarro());
        System.out.println("Tipo de Motor: " + getTipoDeMotor());
        System.out.println("Tipo de Cor: " + getTipoDeCor());
        System.out.println("Tipo de Pneu: " + getTipoDePneu());
        System.out.println("Tipo de Câmbio: " + getTipoDeCambio());
        System.out.println("Tipo de Freio: " + getTipoDeFreio());
        System.out.println("Tipo de Suspenção: " + getTipoDeSuspensao());
    }


    
}
