package entidade;

// INÍCIO DE ESTUDO DE POO - Criando Entidade Carro

public class Carro {

    public String cor;
    public String marca;
    public String modelo;
    public int aroDaRoda;
    public int numeroPortas;

    public void acelerar(){
        System.out.println("Acelerando.");
    }
    public void desacelerar(){
        System.out.println("Desacelerando.");
    }
    public void ligar(){
        System.out.println("Ligando o carro.");
    }
    public void desligar(){
        System.out.println("Desligando o carro.");
    }
}
