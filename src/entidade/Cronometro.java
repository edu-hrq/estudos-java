package entidade;

/* EXERCÍCIO PROPOSTO: Crie uma classe Cronometro com o atributo totalSegundos. Implemente:
- adicionar(int segundos), que soma tempo
- zerar()
- horas(), minutos() e segundos(), que retornam cada parte separadamente
- formatar(), que retorna o tempo no formato horas dois-pontos minutos dois-pontos segundos, sempre com dois dígitos */

public class Cronometro {
    private int totalSegundos;

    public void adicionar(int segundos) {
        totalSegundos += segundos;
    }

    public void zerar() {
        totalSegundos = 0;
    }

    public int horas() {
        return totalSegundos / 3600; // calculo das horas
    }

    public int minutos() {
        return (totalSegundos / 3600) / 60; // calculo dos minutos
    }

    public int segundos() {
        return totalSegundos % 60; // calculo dos segundos
    }

    public String formatar() {
        return String.format("%02d:%02d:%02d", horas(), minutos(), segundos());
    }
}
