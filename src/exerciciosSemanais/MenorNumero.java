package exerciciosSemanais;

/* Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três números lidos.
Em caso de empate, mostrar apenas uma vez. */

import java.util.Locale;
import java.util.Scanner;

public class MenorNumero {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int numero3 = sc.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.printf("O número %d é o menor entre eles.",  numero1);
        } else if (numero2 < numero3) {
            System.out.printf("O número %d é o menor entre eles.", numero2);
        } else {
            System.out.printf("O número %d é o menor entre eles.", numero3);
        }
        sc.close();
    }
}
