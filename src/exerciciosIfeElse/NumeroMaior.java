package exerciciosIfeElse;

//Solicite dois números ao usuário e informe qual é o maior.

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        if (num > num2){
            System.out.println("Esse número é maior: " + num);
        }
        else if (num2 > num){
            System.out.println("Esse número é maior: " + num2);
        }
        else {
            System.out.println("Os números são iguais");
        }

        sc.close();

    }
}
