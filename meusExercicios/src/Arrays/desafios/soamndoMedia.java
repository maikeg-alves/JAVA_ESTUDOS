package Arrays.desafios;

import java.util.Scanner;

public class soamndoMedia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas o aluno tem: ");
        int quantidadeDeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeDeNotas];

        System.out.printf("Informe todas as %d notas do aluno: ", notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nInforme a nota %d : ", i + 1); // 🔻 ASSIM QUE SE FAZ O I COMEÇAR PELO 1
            notas[i] = entrada.nextDouble(); // ⚠️ Tem que usar VIRGULA e não PONTO
        }

        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        System.out.printf("\nA media de notas do aluno é %.2f", total / notas.length);

        entrada.close();

    }
}
