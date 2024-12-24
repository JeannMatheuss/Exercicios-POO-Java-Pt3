import br.com.exercicios.modelos.ModeloCarro;

public class Principal1 {
    public static void main(String[] args) {
        
        ModeloCarro modelo = new ModeloCarro();

        modelo.setNomeDoModelo("Ferrari");
        modelo.setTipoDeCarro("Sedan");
        modelo.setTipoDeCor("Brilhosa");
        modelo.setAnoDeFabricacao(2020);


        modelo.setPrecoAno1(1000000.0);
        modelo.setPrecoAno2(1200000.0);
        modelo.setPrecoAno3(1500000.0);

        
        modelo.precosAoLongoDosAnos();



    }
}
