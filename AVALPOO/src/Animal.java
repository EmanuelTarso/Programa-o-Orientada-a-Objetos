public class Animal {
    String nome;
    int idade;
    String somEmitido;

    public String emitirSom(){
        return somEmitido;
    }

    public Animal(String nome, int idade, String somEmitido) {
        this.nome = nome;
        this.idade = idade;
        this.somEmitido = somEmitido;
    }
}
