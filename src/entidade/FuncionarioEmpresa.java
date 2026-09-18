package entidade;

public class FuncionarioEmpresa {

    public double salario = 1980.80; // caso esqueça de colocar um valor, inicia-se com 0

    public double SalarioFinal(double bonus) {
        return salario - (salario * 0.08) + bonus;
    }
}
