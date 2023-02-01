package EstruturasDeControle;

import java.util.Scanner;

public class metodoswitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.println("Digite a nota do aluno:");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;     
            default:
                conceito = "F";
                break;
        }

        System.out.println("Nota: "+ conceito);

        entrada.close();
    }
}
