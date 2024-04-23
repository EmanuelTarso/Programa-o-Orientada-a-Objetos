public class Peixe extends Animal implements AnimalAquatico{
    String Habitat;
    public Peixe(String nome, int idade, String somEmitido) {
        super(nome, idade, somEmitido);
    }
    @Override
    public String emitirSom() {
        super.emitirSom();
        return "Blub";
    }

    @Override
    public void nadar() {

    }
}
