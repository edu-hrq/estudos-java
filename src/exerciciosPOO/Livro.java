package exerciciosPOO;

/* EXERCÍCIO PROPOSTO: Crie uma classe chamada Livro que tenha os atributos titulo, quantidadePaginas e autor, do tipo Pessoa.
Os atributos devem ser privados.
- Implemente um construtor que receba todos os valores iniciais dos atributos
- Implemente um metodo que imprima na tela as informações do livro, incluindo o autor
- Crie os métodos get e set para cada um dos atributos */

public class Livro {
    private String titulo;
    private int quantidadePaginas;
    private Pessoa autor; // classe já feita anteriormente

    public Livro(String titulo, int quantidadePaginas, Pessoa autor) {
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public void imprimirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de paginas: " + quantidadePaginas);
    }
}