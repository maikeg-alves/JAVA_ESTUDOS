package EstruturasDeControle;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     String texto = "";
     do {
        System.out.println("Para sair vc tem que falar as palavras magicas...");
        System.out.println("quer sair?");
        texto = entrada.nextLine();

     } while(!texto.equalsIgnoreCase("vai logo porra"));

     System.out.println("Obrigao");

     entrada.close();
    }
}


