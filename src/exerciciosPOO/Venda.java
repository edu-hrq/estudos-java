package exerciciosPOO;

/* EXERCÍCIO PROPOSTO: Desenvolva a classe Venda com os atributos quantidade (int) e precoUnitario (double)
Implemente três métodos sobrecarregados:
- calcularPrecoTotal(), sem desconto e sem taxa de entrega
- calcularPrecoTotal(double percentualDesconto), aplicando o desconto sobre o valor total
- calcularPrecoTotal(double percentualDesconto, double taxaEntrega), somando a taxa ao valor com desconto */

public class Venda {
    private int quantidade;
    private double precoUnitario;

    public Venda(int quantidade, double precoUnitario) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularPrecoTotal() {
        return quantidade * precoUnitario;
    }

    public double calcularPrecoTotal(double percentualDesconto) {
        double total = quantidade * precoUnitario;
        double desconto = total * (percentualDesconto / 100);
        return total - desconto;
    }

    public double calcularPrecoTotal(double percentualDesconto, double taxaEntrega) {
        double total = quantidade * precoUnitario;
        double desconto = total * (percentualDesconto / 100);
        return total - desconto + taxaEntrega;
    }
}