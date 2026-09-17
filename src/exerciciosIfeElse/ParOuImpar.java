package exerciciosIfeElse;

// Verifique se o número pedido é par ou ímpar.

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }

        sc.close();

    }
}
