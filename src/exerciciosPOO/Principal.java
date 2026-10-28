package exerciciosPOO;

// Crie uma classe Principal para criar um objeto Paciente e um objeto Nutricionista para calcular o IMC do paciente.

public class Principal {
    public static void main(String[] args) {

        Conta[] contas = new Conta[3];

        contas[0] = new ContaEspecial("Eduardo", 111, 1900, 500);
        contas[1] = new ContaEstudante("Kethly", 292, 2400, 2400);

        contas[0].depositar(500);
        contas[1].depositar(500);

        contas[0].sacar(600);
        contas[1].sacar(800);
    }
}