import br.com.exercicios.modelos4.GeradorPrimo;
import br.com.exercicios.modelos4.NumerosPrimos;
import br.com.exercicios.modelos4.VerificadorPrimo;

public class Principal4 {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}

// Exercicio FINALIZADO