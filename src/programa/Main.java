package programa;

import entidade.Circulo;
import entidade.Retangulo;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(10, 10);

        System.out.printf("A área do retângulo é de: %.2f\n", retangulo.calcularArea());
        System.out.printf("O perímetro do retângulo é de: %.2f\n", retangulo.calcularPerimetro());


        Circulo circulo = new Circulo(5);

        System.out.printf("A área do círculo é de: %.2f\n", circulo.calcularArea());
        System.out.printf("O círculo cabe no retângulo? %b", circulo.cabeEm(retangulo));
    }
}