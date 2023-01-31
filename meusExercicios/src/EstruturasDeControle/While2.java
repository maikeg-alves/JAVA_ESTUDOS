package EstruturasDeControle;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String command = "";
        while (!"sair".equals(command.toLowerCase())) {
            System.out.print("Você diz: ");
            command = entrada.next();
        }

        entrada.close();

    }
}
