package exerciciosSemanais;

// Leia 3 valores FLOAT e efetue o calculo das raízes da equação de bhaskara.
// Se não for possível calcular as raízes, mostre a mensagem correspondente: "impossível calcular" caso haja uma divisão por 0 ou raíz de número negativo.

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // definição de linguagem padrão do código
        Scanner sc = new Scanner(System.in); // Scanner

        System.out.print("Digite um valor: ");
        double a =  sc.nextDouble();
        System.out.print("Digite outro valor: ");
        double b =  sc.nextDouble();
        System.out.print("Digite outro valor: ");
        double c =  sc.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (a == 0 || delta < 0) { // verificação se delta é 0 ou negativo
            System.out.println("Impossível calcular.");
        } else { // senão, calcular X
            System.out.printf("Valor de delta: %.2f\n", delta);

            double r1 = (-b + Math.sqrt(delta)) / (2 * a); // o Math.sqrt(variavel) calcula a raíz quadrada da variável
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("Valor de R1: %.5f\n", r1);
            System.out.printf("Valor de R2: %.5f\n", r2);
        }

        sc.close();
    }
}
