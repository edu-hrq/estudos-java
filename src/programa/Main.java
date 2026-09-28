package programa;
import entidade.*;

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

/*        Usuario usuario = new Usuario();
        usuario.login("12345678", "123");*/

        Cachorro cachorro = new Cachorro();
        cachorro.cor = "Preto";
        cachorro.tamanho = 100;
        cachorro.peso = 8.5;
        cachorro.correr();
        cachorro.dormir();
        cachorro.latir();

        System.out.println("-----------");

        Passaro passaro = new  Passaro();
        passaro.cor = "Azul";
        passaro.tamanho = 18;
        passaro.peso = 1.5;
        passaro.correr();
        passaro.dormir();
        passaro.voar();

    }
}