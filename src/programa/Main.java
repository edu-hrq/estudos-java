package programa;

import entidade.Animal;
import entidade.Cachorro;
import entidade.Gato;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        Animal meuOutroAnimal = new Gato();

        meuAnimal.fazerSom();
        meuOutroAnimal.fazerSom();
    }
}