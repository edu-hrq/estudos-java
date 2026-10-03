package entidade;

/* EXERCÍCIO PROPOSTO: Crie a classe BombaCombustivel que representa uma bomba de combustível, com os seguintes atributos privados:
valorLitro, quantidadeCombustivel, tipoCombustivel. A classe também deve possuir os seguintes métodos:

- abastecerCarro(double valor), onde é informado o valor a ser abastecido, exibe a quantidade de litros que foi colocada no veículo
e atualiza a quantidade de combustível da bomba. O metodo abastecerCarro deve recusar a operação se não houver combustível suficiente.
- alterarValor(double valorLitro), que altera o valor do litro do combustível
- abastecerBomba(double quantidade), que adiciona a quantidade informada à bomba
- getQuandidadeCombustivel(), que retorna o valor da quantidade de combustível da bomba */

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
