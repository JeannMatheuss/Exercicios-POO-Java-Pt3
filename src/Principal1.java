import br.com.exercicios.modelos.ModeloCarro;

public class Principal1 {
    public static void main(String[] args) {
        
        ModeloCarro modelo = new ModeloCarro();

        // Detalhes do primeiro carro
        modelo.setNomeDoModelo("Ferrari");
        modelo.setAnoDeFabricacao(2020);
        modelo.setTipoDeCarro("Super Carro");
        modelo.setTipoDeMotor("V8");
        modelo.setTipoDeCor("Brilhosa");
        modelo.setTipoDePneu("Normal");
        modelo.setTipoDeCambio("Manual");
        modelo.setTipoDeFreio("Disco");
        modelo.setTipoDeSuspensao("Ar");

        // Detalhes do preço do carro
        modelo.setPrecoAno1(1000000.0);
        modelo.setPrecoAno2(1200000.0);
        modelo.setPrecoAno3(1500000.0);

        // Exibição dessas informações
        modelo.exibirFichaDoCarro();
        modelo.precosAoLongoDosAnos();

        modelo.exibirMaiorMenor();

    }
}

// Exercicio finalizado
