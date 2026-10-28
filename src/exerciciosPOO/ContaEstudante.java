package exerciciosPOO;

public class ContaEstudante extends Conta {
    private double limiteTotal;

    public ContaEstudante(String titular, int numero, double saldo, double limiteTotal) {
        super(titular, numero, saldo);
        this.limiteTotal = limiteTotal;
    }

    public void sacar(double saque) {
        if (saque <= limiteTotal) {
            this.saldo -= saque;
            this.limiteTotal -= saque;
            System.out.println("Saque realizado com sucesso!");
        } else  {
            System.out.println("Saldo insuficiente");
        }
    }
}