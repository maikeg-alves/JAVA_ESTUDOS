package EstruturasDeControle;

import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int alunos = 0;
        double nota = 0;
        double total = 0;

        System.out.println("||======== Media da Turma =======||");
        System.out.println("||    digite a nota dos alunos   ||");
        System.out.println("||===============================||"); 
        
        do {
         System.out.printf("\nAluno %d nota: ", alunos );
         nota = entrada.nextDouble();

         if (nota <= 10 && nota >= 0) {
            total += nota;
            alunos++;
         } else if (nota > 10 ){
            System.out.println("Nota invalida, digite novamente!");
         } else {
            nota = -1;
         }

        } while (nota != -1); 


        System.out.println("\n||===============================||");
        System.out.printf("||     amédia da tuma é %.2f     ||\n", total / alunos);
        System.out.println("||===============================||");

        entrada.close();
    }
}
