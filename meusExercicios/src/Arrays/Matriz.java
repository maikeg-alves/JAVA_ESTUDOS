package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtDeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por alunos? ");
        int qtDeNotas = entrada.nextInt();

        double[][] alunos = new double[qtDeAlunos][qtDeNotas];

        double total = 0;
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos.length; j++) {
                System.out.printf("\nInforme a nota %d do aluno %d: ", j+1, i+1);
                alunos[i][j] = entrada.nextDouble(); 
                total += alunos[i][j];
            }
        }

        double media = total / (qtDeAlunos * qtDeNotas);

        System.out.printf("\nA media da turma foi de %.2f", media);

        entrada.close();

    }
}