package exerciciosIfeElse;

// Receba uma nota de 0 a 10 e classifique como "Aprovado" (nota ≥ 7) ou "Reprovado".

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota do aluno: ");
        float nota = sc.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();

    }
}
