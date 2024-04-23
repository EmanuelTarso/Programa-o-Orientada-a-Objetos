public class TrabalhoVoluntario extends Projeto{
    String tipoT;
    int duracaoT;

    public TrabalhoVoluntario(String nomeP, String descricao, String endereco, String datainicio, String datafim) {
        super(nomeP, descricao, endereco, datainicio, datafim);
    }

    @Override
    public boolean validaProjeto(String nomeP) {
        if (duracaoT>2) return true;
        else return false;
    }

    @Override
    public String imprimeProjeto() {
        System.out.println(nomeP + descricao + datainicio + datafim + tipoT + duracaoT);
        return imprimeProjeto();
    }
}
