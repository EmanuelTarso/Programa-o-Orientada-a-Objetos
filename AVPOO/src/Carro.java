public class Carro extends Veiculo implements Alugavel{
    public Carro(String modelo, String marca, int anof, boolean disponivel) {
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
