package exerciciosIfeElse;

//Peça a idade do usuário e informe se ele pode votar (idade mínima: 16 anos)

import java.util.Scanner;

public class IdadeParaVotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16 && idade < 18) {
            System.out.println("Você pode votar.");
        } else if (idade >= 18 && idade < 70) {
            System.out.println("Você tem a obrigação de votar");
        } else if  (idade >= 70) {
            System.out.println("Você não precisa votar.");
        } else {
            System.out.println("Você não tem permissão de votar.");
        }

        sc.close();

    }
}
