package fundamentos.DesafioFundamentos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n||=========== Calculadora ========||");

        System.out.print("Escreva o primeiro valor: ");
        double value1 = entrada.nextDouble();
        System.out.print("Escreva o segundo valor: ");
        double value2 = entrada.nextDouble();
        System.out.println("\n||===== Escolha uma operação ====|| ");
        System.out.println("||===== | + | - | * | / | % | ====||");
        System.out.println("||================================||");
        String operador = entrada.next();

        double soma = "+".equals(operador) ? (value1 + value2) : 0;
        soma = "-".equals(operador) ? (value1 - value2) : soma;
        soma = "*".equals(operador) ? (value1 * value2) : soma;
        soma = "/".equals(operador) ? (value1 / value2) : soma;
        soma = "%".equals(operador) ? (value1 % value2) : soma;

        System.out.printf(soma != 0 ? "%.2f %S %.2f = %.2f" : "Operador não encontrado", value1, operador, value2, soma);

        entrada.close();
    }
}
