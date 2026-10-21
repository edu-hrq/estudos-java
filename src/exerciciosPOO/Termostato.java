package exerciciosPOO;

public class Termostato {
    private double temperaturaAtual;
    private double temperaturaAlvo;

    public Termostato(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void setTemperaturaAlvo(double temperaturaAlvo) {
        if (temperaturaAlvo >= 16 && temperaturaAlvo <= 30) {
            this.temperaturaAlvo = temperaturaAlvo;
        }
    }

    public void ciclo() {
        if (temperaturaAtual > temperaturaAlvo) {
            temperaturaAtual -= 0.5;
        } else if (temperaturaAtual < temperaturaAlvo) {
            temperaturaAtual += 0.5;
        }
    }

    public boolean estabilizado() {
        return Math.abs(temperaturaAtual - temperaturaAlvo) < 0.5; // retorna true se a diferença entre as duas variaveis for menor que 0,5
    }
}
