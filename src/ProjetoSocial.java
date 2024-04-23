public class ProjetoSocial {
    public static void main(String[] args) {
        DistribuicaoAlimento d1 = new DistribuicaoAlimento("NomeA","Doacao de leite","RuaA", "10/10/10", "10/10/11");
        TrabalhoVoluntario t1 = new TrabalhoVoluntario("NomeB", "Catar lixo da rua", "RuaB", "11/11/11", "11/11/12");

        t1.imprimeProjeto();
        d1.imprimeProjeto();
    }
}
