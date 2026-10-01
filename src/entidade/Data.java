package entidade;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) { // se o dia for menor que 1 ou maior que 31:
            throw new IllegalArgumentException("Data inválida");
        }
        if (mes < 1 || mes > 12) { // se o mês for menor que 1 ou maior que 12:
            throw new IllegalArgumentException("Mês inválido");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (dia > diasNoMes()) { // se o dia informado for maior que o máximo de dias daquele mês:
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public int diasNoMes() {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12: // junção dos meses que terminam com 31
                return 31;
            case 2:
                if (ehBissexto()) {
                    return 29;
                } else {
                    return 28;
                }
            case 4, 6, 9, 11: // junção dos meses que terminam com 30
                return 30;
            default:
                throw new IllegalArgumentException("Data inválida");
        }
    }

    public boolean ehBissexto() {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) { // eh bissexto se for divisivel por 4 e não for divisível por 100 ou for divisivel por 400.
            return true;
        } else {
            return false;
        }
    }

    public String formatar() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public boolean ehAnterior(Data outra) {
        return ano < outra.ano
                || ano == outra.ano && mes < outra.mes
                || ano == outra.ano && mes == outra.mes && dia < outra.dia;
        /* Expressão antiga:
            if (ano < outra.ano) {
                return true;
            } else if (ano == outra.ano && mes < outra.mes) {
                return true;
            } else if (ano == outra.ano && mes == outra.mes && dia < outra.dia) {
                return true;
            } else {
                return false; */
    }
}