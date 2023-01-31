package EstruturasDeControle;

import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota:");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota invalida!");
        } else if (nota >= 8.0) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else {
            System.out.println("Coceito F");
        }

        entrada.close();
    }
}
