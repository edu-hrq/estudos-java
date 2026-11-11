package programa;

import conceitoGenerics.Caixa;
import exerciciosPOO.Aluno;

public class Main {
    public static void main(String[] args) {

        Caixa<String> caixa = new Caixa<String>(); // o genérico T, que estava na classe Caixa, se torna um tipo String.
        Caixa<Double> caixa2 = new Caixa<Double>(); // o genérico T nesse caso se torna um Double.

        caixa.setAtributo("nome");
        caixa2.setAtributo(2.1);
    }
}