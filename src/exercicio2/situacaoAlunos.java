package exercicio2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class situacaoAlunos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Alunos> listaAlunos = new ArrayList<>();

        System.out.println("Digite a quantidade de alunos: ");

        int tamanho = input.nextInt();
        input.nextLine();

        for (int i = 0; i < tamanho; i++){

            System.out.println("Digite o nome do aluno: ");
            String nomeAluno = input.nextLine();

            System.out.println("Digite a nota do aluno: ");
            double notaAluno = input.nextDouble();
            input.nextLine();

            listaAlunos.add(new Alunos(nomeAluno, notaAluno));

        }

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (Alunos aluno : listaAlunos) {

            double nota = aluno.getNota();
            String nome = aluno.getNome();

            if (nota >= 7){
                System.out.println("Parabéns " + nome + " Você foi aprovado.");
                aprovados++;
            } else if (nota >= 5){
                System.out.println(nome + " Você está de recuperação.");
                recuperacao++;
            } else {
                System.out.println(nome + " Você está reprovado.");
                reprovados++;
            }
        }

        System.out.println("\nAprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);


    }
}
