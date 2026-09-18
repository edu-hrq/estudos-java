package exerciciosSemanais;

/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:

a) a área do triângulo retângulo que tem A como base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

import java.util.Locale;
import java.util.Scanner;

public class CalculoDasAreas {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        float a = sc.nextFloat();
        System.out.print("Valor de B: ");
        float b = sc.nextFloat();
        System.out.print("Valor de C: ");
        float c = sc.nextFloat();

        double pi = 3.14159;

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = pi * (c * c);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.printf("Área do Triângulo: %.3f\n", areaTriangulo);
        System.out.printf("Área do Círculo: %.3f\n", areaCirculo);
        System.out.printf("Área do Trapézio: %.3f\n", areaTrapezio);
        System.out.printf("Área do Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Área do Retângulo: %.3f\n", areaRetangulo);
    }
}
