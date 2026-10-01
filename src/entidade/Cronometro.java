package entidade;

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
