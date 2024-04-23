public class Ave extends Animal{
    int envergadura;
    public Ave(String nome, int idade, String somEmitido) {
        super(nome, idade, somEmitido);
    }
    @Override
    public String emitirSom() {
        super.emitirSom();
        return "HAAAAAAH";
    }
}
