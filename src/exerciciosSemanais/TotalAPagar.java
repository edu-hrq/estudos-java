package exerciciosSemanais;

/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

import java.util.Locale;
import java.util.Scanner;

public class TotalAPagar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o ID da peça? ");
        int idPeca1 = sc.nextInt();
        System.out.print("Qual a quantidade de peças? ");
        int qtdPeca1 = sc.nextInt();
        System.out.print("Qual o valor de cada unidade? ");
        double valorPeca1 = sc.nextDouble();

        System.out.print("Qual o ID da peça? ");
        int idPeca2 = sc.nextInt();
        System.out.print("Qual a quantidade de peças? ");
        int qtdPeca2 = sc.nextInt();
        System.out.print("Qual o valor de cada unidade? ");
        double valorPeca2 = sc.nextDouble();

        double soma = (valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
        sc.close();
    }
}
