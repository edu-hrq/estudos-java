package exerciciosPOO;

// Crie uma classe Principal para criar um objeto Paciente e um objeto Nutricionista para calcular o IMC do paciente.

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Nutricionista nutricionista = new Nutricionista();

        paciente.setPeso(120);
        paciente.setAltura(1.90);

        System.out.printf("%.2f", nutricionista.calcularIMC(paciente));
    }
}