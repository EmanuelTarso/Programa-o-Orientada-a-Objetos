public class Caminhao extends Veiculo implements Alugavel{
    public Caminhao(String modelo, String marca, int anof, boolean disponivel) {
        super(modelo, marca, anof, disponivel);
    }

    @Override
    public boolean Alugar(boolean alugar) {
        return false;
    }

    @Override
    public boolean Devolver(boolean devolver) {
        return false;
    }
}
