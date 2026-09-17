package exerciciosSintaxe;

// Crie um programa que realiza soma, subtração, multiplicação e divisão entre dois números.

import java.util.Scanner;

public class CalculosSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("A soma desses números é de: " + (numero1 + numero2));
        System.out.println("A subtração desses números é de: " + (numero1 - numero2));
        System.out.println("A multiplicação desses números é de: " + (numero1 * numero2));
        System.out.println("A divisão desses números é de: " + (numero1 / numero2));
    }
}
