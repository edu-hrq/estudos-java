package entidade;

/* EXERCÍCIO PROPOSTO: Crie uma classe chamada Pessoa que tenha os atributos privados nome, sobrenome e idade.

- Implemente um metodo construtor que receba os parâmetros nome, sobrenome e idade para inicializar os atributos
- Implemente os metodos get e set para cada um dos atributos
- Implemente um metodo que imprima na tela as informações da pessoa
- Acrescente validação no metodo adequado: a idade não pode ser negativa nem maior que 130. */

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        if (idade < 0 || idade > 130) {
            throw new IllegalArgumentException("Idade inválida");
        }

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 130) {
            throw new IllegalArgumentException("Idade inválida");
        }

        this.idade = idade;
    }

    public void informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
    }
}
