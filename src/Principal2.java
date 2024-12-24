import br.com.exercicios.modelos2.Animal;
import br.com.exercicios.modelos2.Cachorro;
import br.com.exercicios.modelos2.Gato;

public class Principal2 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Trovão Uchiha");
        cachorro.setIdade(3);
        cachorro.setCor("Preto");
        cachorro.setRaca("Golden");


        Gato gato = new Gato();
        gato.setNome("Kitty");
        gato.setIdade(2);
        gato.setCor("Branco");
        gato.setRaca("Persa");

        // Ficha com as informações do cachorro
        cachorro.fichaDoAnimal();
    }
}
