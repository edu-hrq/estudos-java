package entidade;

public class Usuario {

    public String email;
    public String senha;

    public Usuario(String email, String senha) {

        System.out.println("Construtor executado.");

        this.email = email; // o this é o atributo, o email sem nada é o parâmetro dentro de Usuario().
        this.senha = senha;

        System.out.printf("E-mail: %s\n", email);
        System.out.printf("Senha: %s", senha);
    }
}
