package entidade;

public class Usuario {

    public String email;
    public String senha;

    //Assinatura de um construtor: nome + parametro e tipo
    public Usuario(String email, String senha) {

        System.out.println("AUTENTICAÇÃO POR EMAIL E SENHA");

    }

    public Usuario(String telefone) {

        System.out.println("AUTENTICAÇÃO POR TELEFONE.");

    }
}
