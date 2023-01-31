package EstruturasDeControle;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        boolean status = false;
        Scanner entrada = new Scanner(System.in);

        while (!status) {
            String command = entrada.next();

            if ("sair".equals(command.toLowerCase())) {
                status = true;
            }

            System.out.println("...");

        }

        entrada.close();

    }
}
