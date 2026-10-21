package entidade;

// EXERCÍCIO PROPOSTO: Crie uma classe chamada Nutricionista, que será responsável por calcular o IMC do paciente.
// Implemente um metodo calcularIMC, que receberá um objeto do tipo Paciente e retornará o valor do IMC.

public class Nutricionista {
    public double calcularIMC(Paciente paciente) {
        return paciente.peso / (paciente.altura * paciente.altura);
    }
}
