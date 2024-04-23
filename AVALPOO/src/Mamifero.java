public class Mamifero extends Animal{
    int mamas;
    public Mamifero(String nome, int idade, String somEmitido) {
        super(nome, idade, somEmitido);
    }
    @Override
    public String emitirSom() {
        super.emitirSom();
        return "MUUUUU";
    }
}
