package exerciciosSemanais;

// FORMATAÇÃO SIMPLES: Como usar da forma correta.

public class Formatacao {
    public static void main(String[] args) {

        double preco = 130.60;
        int idade = 20;
        String nome = "Eduardo";

        System.out.printf("%.2f\n", preco); // o .2f traz 2 casas decimais após o ponto.
        // o \n faz pular a linha
        System.out.printf("%.4f\n\n", preco); // o .2f traz 4 casas decimais após o ponto.

        System.out.printf("O preço dessa mercadoria é: R$ %.2f\n", preco); // o valor aparecerá onde está a formatação.
        System.out.printf("Idade é: %d\n", idade); // para usar uma variável de valor int, deve ser usado o %d
        System.out.printf("O nome é: %s\n", nome); // para usar uma variável String, deve ser usado o %s

        System.out.printf("O preço da mercadoria é R$ %.2f, o cliente é %s e ele tem %d anos.\n", preco, nome, idade);
    }
}
