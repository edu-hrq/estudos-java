package entidade;

public class Programador extends Pessoa implements Presidenciavel { // implements vai usar da interface
    @Override
    public void candidatarPresidente() {
        System.out.println("Candidatar-se a presidente");
    }
}
