package entidade;

/* EXERCÍCIO PROPOSTO:
Desenvolva uma classe Aluno com os atributos privados matricula, nome, curso, notaAV1, notaAV2 e notaAV3.

- Implemente o metodo construtor da classe Aluno que receba os parâmetros matricula, nome e curso para inicializar os atributos correspondentes
- Implemente os metodos para atualizar cada nota
- Implemente um metodo para calcular a média e verificar se o aluno está aprovado, considerando média maior ou igual a 7 */

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private double notaAV1;
    private double notaAV2;
    private double notaAV3;

    public Aluno(int matricula,  String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public void atualizarNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public void atualizarNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public void atualizarNotaAV3(double notaAV3) {
        this.notaAV3 = notaAV3;
    }

    public double calcularMedia() {
        return (notaAV1 + notaAV2 + notaAV3) / 3;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7;
    }
}
