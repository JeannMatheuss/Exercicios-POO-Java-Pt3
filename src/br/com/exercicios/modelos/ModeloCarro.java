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


    public void exibirTipo() {
        System.out.println("Tipo de Carro: " + this.tipoDeCarro);
        System.out.println("Tipo de Cor: " + this.tipoDeCor);
        System.out.println("Tipo de Pneu: " + this.tipoDePneu);
        System.out.println("Tipo de Motor: " + this.tipoDeMotor);
        System.out.println("Tipo de Cambio: " + this.tipoDeCambio);
        System.out.println("Tipo de Freio: " + this.tipoDeFreio);
        System.out.println("Tipo de Suspensao: " + this.tipoDeSuspensao);
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    
}
