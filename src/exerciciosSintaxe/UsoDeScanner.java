package exerciciosSintaxe;

// Use Scanner para receber um nome e exibir "Olá, [nome]!"

import java.util.Scanner; // importação do Scanner

public class UsoDeScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome + "!");

        sc.close();
    }
}
