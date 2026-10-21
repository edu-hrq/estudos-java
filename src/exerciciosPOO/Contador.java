package exerciciosPOO;

/* EXERCÍCIO PROPOSTO: Crie uma classe Contador que encapsule um valor usado para contagem de itens. A classe deve oferecer os métodos:
- zerar(), que retorna o contador a zero
- incrementar(), que soma um ao contador
- decrementar(), que subtrai um, sem nunca deixar o valor ficar negativo
- getValor(), que retorna o valor atual
O atributo do contador deve ser privado. Como o valor já muda por incrementar e decrementar,
avalie se um setter teria alguma utilidade aqui e registre a sua conclusão em comentário. */

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0; // valor inicia-se em 0
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++; // incrementa 1 ao valor
    }

    public void decrementar() {
        if (this.valor > 0) {
            this.valor--; // retira 1 de valor se valor for positivo, senão, não faz nada
        }
    }

    public int getValor() {
        return this.valor;
    }

    /*Conclusão: Não precisa de um setter pois se fizermos isso, poderemos setar o mesmo como negativo e isso vai contra as regras de negócio.
    Nesse caso, é desnecessário também porque temos funções para incrementar ou decrementar o valor.
     */

}
