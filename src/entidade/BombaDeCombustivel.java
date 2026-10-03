package entidade;

public class BombaDeCombustivel {
    private double valorLitro;
    private double quantidadeCombustivel;
    private String tipoCombustivel;

    public void abastecerCarro(double valor) { // sofrerá alterações
    }

    public double alterarValor(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double abastecerBomba(double quantidade) {
        this.quantidadeCombustivel +=  quantidade;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
