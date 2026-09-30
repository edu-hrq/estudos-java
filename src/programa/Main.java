package programa;

import entidade.Aluno;
import entidade.Circulo;
import entidade.Retangulo;

public class Main {
    public static void main(String[] args) {
        Aluno eduardo = new Aluno(0, "Eduardo", "ADS");

        eduardo.atualizarNotaAV1(10);
        eduardo.atualizarNotaAV2(8);
        eduardo.atualizarNotaAV3(9);
        eduardo.calcularMedia();

        System.out.printf("O aluno %s do curso %s está aprovado? %b", eduardo.getNome(), eduardo.getCurso(), eduardo.estaAprovado());
    }
}