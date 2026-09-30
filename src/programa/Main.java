package programa;

import entidade.Retangulo;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(10, 10);

        System.out.printf("A área do retângulo é de: %.2f\n", retangulo.calcularArea());
        System.out.printf("O perímetro do retângulo é de: %.2f", retangulo.calcularPerimetro());
    }
}