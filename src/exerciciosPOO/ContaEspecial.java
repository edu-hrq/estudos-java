package exerciciosPOO;

public class ContaEspecial extends Conta {
    private double limitePorSaque;

    public ContaEspecial(String titular, int numero, double saldo, double limitePorSaque) {
        super(titular, numero, saldo);
        this.limitePorSaque = limitePorSaque;
    }

    public void sacar(double saque) {
        if (saque <= limitePorSaque) {
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso |  Saldo atual: R$ " + saldo);
        } else  {
            System.out.println("Não foi possível efetuar o saque - Saque acima do limite permitido.");
        }
    }
}