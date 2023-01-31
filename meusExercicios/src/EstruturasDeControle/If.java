package EstruturasDeControle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe a média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Você passou parabens!");
        }

        if (media < 7.0 && media >= 5.0) {
            System.out.println("em recuperação");
        }

        if (media < 5.0 && media >= 0) {
            System.out.println("Reprovado");
        }

        entrada.close();
    }

}
