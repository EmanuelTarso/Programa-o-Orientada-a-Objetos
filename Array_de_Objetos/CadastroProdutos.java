import java.util.Scanner;
public class CadastroProdutos{
    public static void main(String[] args) {
        Scanner scr =  new Scanner(System.in);
        Produto[] lista1 = new Produto[3];

    for (int i = 0; i < 3; i++) {
     lista1[i] = new Produto("a", 0,0);
    }

    for(int i = 0; i < 3; i++){
        System.out.println("Digite o nome do produto " + (i + 1) + ": ");
        lista1[i].setNome(scr.nextLine());

        System.out.println("Digite o preco do produto " + (i + 1) + ": ");
        lista1[i].setPreco(scr.nextDouble());
        scr.nextLine();

        System.out.println("Digite a quantidade do produto " + (i + 1) + ": ");
        lista1[i].setQuant(scr.nextInt());
        scr.nextLine();

    }    
    scr.close();
    for(int i = 0; i < 3; i++) {
        System.out.println("Detalhes do produto " + (i + 1) + ":");
        System.out.println("Nome: " + lista1[i].getNome());
        System.out.println("Preço: " + lista1[i].getPreco());
        System.out.println("Quantidade: " + lista1[i].getQuant());
        System.out.println("Valor total: " + lista1[i].getPreco() * lista1[i].getQuant());
    }

    }
}


