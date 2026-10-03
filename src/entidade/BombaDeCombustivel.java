package entidade;

public class BombaDeCombustivel {
    private double valorLitro;
    private double quantidadeCombustivel;
    private String tipoCombustivel;

    public void abastecerCarro(double valor) {
        double litros = valor / valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Abastecimento indisponível: Quantidade de combustível na Bomba insuficiente.");
        } else {
            System.out.println("Quantidade de litros abastecida: " + litros + "L.");
            this.quantidadeCombustivel -= litros;
        }
    }

    public void alterarValor(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void abastecerBomba(double quantidade) {
        this.quantidadeCombustivel += quantidade;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
