package entidade;

// EXERCÍCIO PROPOSTO:
//Crie uma Classe Círculo que calcule Área, Diâmetro, Circunferência e que verifica se Cabe em Retângulo.

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2); //Math.pow = potencia, nesse caso, raio².
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double calcularDiametro() {
        double diametro = 2 * raio;
        return diametro;
    }

    public boolean cabeEm(Retangulo retangulo) {
        return calcularDiametro() <= retangulo.calcularArea()
                && calcularDiametro() <= retangulo.calcularPerimetro();
    }
}
