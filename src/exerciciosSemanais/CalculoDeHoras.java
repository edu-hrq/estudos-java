package exerciciosSemanais;

/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais */

import java.util.Locale;
import java.util.Scanner;

public class CalculoDeHoras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de Identificação do Usuário: ");
        int numeroFuncionario = sc.nextInt();
        System.out.print("Qual a quantidade de horas totais trabalhadas: ");
        double horasTrabalhadas = sc.nextInt();
        System.out.printf("Digite o valor da hora do funcionário %d: ", numeroFuncionario);
        double valorHora = sc.nextDouble();

        double salario =  valorHora * horasTrabalhadas;

        System.out.printf("Número de Identificação = %d\n", numeroFuncionario);
        System.out.printf("Salário = R$ %.2f", salario);

        sc.close();
    }
}
