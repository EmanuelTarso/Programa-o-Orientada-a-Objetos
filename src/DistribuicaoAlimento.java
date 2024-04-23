public class DistribuicaoAlimento extends Projeto {
    String descAlimento;
    float quantidade;

    public DistribuicaoAlimento(String nomeP, String descricao, String endereco, String datainicio, String datafim) {
        super(nomeP, descricao, endereco, datainicio, datafim);
    }

    @Override
    public boolean validaProjeto(String nomeP) {
        if (datafim.isEmpty())
        return true;
        else return false;
    }

    @Override
    public String imprimeProjeto() {
        System.out.println(nomeP + descAlimento + datainicio + datafim + descAlimento + quantidade);
        return imprimeProjeto();
    }
}
