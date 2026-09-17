package exerciciosDoCursoIfeElse;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
       double numero = sc.nextDouble();

       if (numero < 0){
           System.out.println("O número digitado é negativo.");
       } else if (numero > 0){
           System.out.println("O número digitado é positivo.");
       } else {
           System.out.println("O número digitado é zero.");
       }
    }
}
