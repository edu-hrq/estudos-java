package conceitoGenerics;

public class Caixa <T> { // o tipo genérico (que está entre <>) ainda não está definido.
    private T atributo;

    public void setAtributo(T atributo) {
        this.atributo = atributo;
    }

    public T getAtributo() {
        return atributo;
    }

}
