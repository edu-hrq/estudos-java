package programa;
import entidade.Usuario;

import entidade.Carro; // importação da classe Carro, que está localizada no package entidade
import entidade.FuncionarioEmpresa;

public class Main {
    public static void main(String[] args) {
/*        Carro bmw = new Carro(); // Com esse comando, estou a instanciar um novo veículo, com todas as características da classe Carro.
        Carro corsa = new Carro(); // Outro objeto, usa os mesmos atributos, mas recebe valores diferentes.

        bmw.cor = "Preto";
        bmw.modelo = "M3 1986";
        bmw.marca = "BMW";
        bmw.aroDaRoda = 17;
        bmw.numeroPortas = 4;

        corsa.cor = "Branco";
        corsa.modelo = "Corsa 2010";
        corsa.marca = "Chevrolet";
        corsa.aroDaRoda = 15;
        corsa.numeroPortas = 4;

        System.out.println(bmw.modelo); // mostrando valor do atributo modelo da classe
        corsa.ligar(); // uso da ação da classe.*/

/*        FuncionarioEmpresa eduardo = new FuncionarioEmpresa();
        double salarioLiquido = eduardo.SalarioFinal(80);
        System.out.printf("Salario Liquido: R$ %,.2f", salarioLiquido);*/

        Usuario usuario = new Usuario();
        usuario.login("12345678", "123");

    }
}