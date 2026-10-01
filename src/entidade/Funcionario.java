package entidade;

/* EXERCÍCIO PROPOSTO: Crie uma classe chamada Funcionario que tenha os atributos privados nome, salario e cargo.

Implemente um construtor que receba todos os valores iniciais dos atributos
Implemente os metodos get e set para os atributos nome e cargo
Implemente um metodo aumentarSalario(), que receberá um valor de porcentagem de aumento e irá reajustar o valor do atributo salario

Regra adicional: nenhum aumento pode passar de 50 por cento de uma vez, e essa verificação deve ficar dentro do metodo aumentarSalario. */

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double aumentarSalario(double porcentagemDeAumento) {
        if (porcentagemDeAumento > 50) {
            throw new IllegalArgumentException("Porcentagem de Aumento não deve ser maior que 50%");
        }
        double valorAAdicionar = porcentagemDeAumento / 100;
        salario += salario * valorAAdicionar;
        return salario;
    }
}