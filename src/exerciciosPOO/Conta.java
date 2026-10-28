package exerciciosPOO;

public class Conta {
    protected String titular;
    protected int numero;
    protected double saldo;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Depósito efetuado | Saldo atual: R$ " + saldo);
    }
}