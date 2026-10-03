package entidade;

/* EXERCÍCIO PROPOSTO: Crie uma classe Usuario com os atributos login e senha. O atributo senha deve ser privado e não deve ter getter.
- definirSenha(String nova) só aceita senhas com pelo menos 8 caracteres
- autenticar(String tentativa) retorna true se a senha estiver correta
- trocarSenha(String antiga, String nova) só troca se a antiga estiver correta
- Após três tentativas erradas, a conta deve ser bloqueada */

public class Usuario {
    private String login;
    private String senha;
    private int tentativasErradas;
    private boolean bloqueado;

    public void definirSenha(String nova) {
        if (nova.length() >= 8) {
            this.senha = nova;
        }
    }

    public boolean autenticar(String tentativa) {
        if (bloqueado) { // verifica se está bloqueado
            System.out.println("Conta bloqueada.");
            return false;
        } else if (tentativa.equals(this.senha)) { // se a tentativa for correta
            tentativasErradas = 0;
            return true;
        } else { // se estiver errada
            tentativasErradas++; // soma 1 a variavel tentativasErradas

            if (tentativasErradas >= 3) { // se for igual ou maior que 3
                bloqueado = true; // usuário bloqueado
            }
            return false;
        }
    }

    public void trocarSenha(String antiga, String nova) {
        if (antiga.equals(this.senha) && nova.length() >= 8) { // se a senha antiga for igual e a senha nova tiver mais de 8 caracteres
            this.senha = nova;
        }
    }
}