package entidade;

// EXERCÍCIO PROPOSTO:
//Crie uma classe Retângulo que calcule Área e Perímetro

public class Retangulo {
    public double altura;
    public double largura;

    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    public double calcularPerimetro(double altura, double largura) {
        return (altura * largura) * 2;
    }

}