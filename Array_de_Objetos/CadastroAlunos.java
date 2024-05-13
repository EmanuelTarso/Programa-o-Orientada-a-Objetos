import java.util.Scanner;
public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Aluno[] lista2 =  new Aluno[5];

        for (int i = 0; i < 5; i++) {
            lista2[i] = new Aluno("a", 0);
        }

           for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do Aluno " + (i + 1) + ": ");
            lista2[i].setNome(scr.nextLine());
    
            System.out.println("Digite a idade do Aluno " + (i + 1) + ": ");
            lista2[i].setIdade(scr.nextInt());
           scr.nextLine();
        }
        scr.close();

        System.out.println("Alunos cadastrados");
        for(int i = 0; i < 5; i++){
            System.out.println(lista2[i].getNome() + ", " + lista2[i].getIdade() + " anos" );
            System.out.println("");
        }
}
}
