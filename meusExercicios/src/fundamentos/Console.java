package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        /* ele não pula linhas e escreve junto */ 
        System.out.print("Bom ");
        System.out.print("dia!\n\n");

        /* aqui ele pula sozinho sem precisar do \n */
        System.out.println("Bom");
        System.out.println("dia!");

        /* 
            ✅  siga a tabela  ✅

             %d	inteiro decimal
             %f	ponto flutuante decimal
             %s	string
             %c	caractere
             %b	boolean
             %x	inteiro hexadecimal
             %o	inteiro octal
         */

         /* aqui vc pode adiconar dadods de valores ou variaveis de forma mais sucinta */

        System.out.printf("Megasena: %d %d %d %d %d \n", 1 , 2, 3, 4, 5);

        /* formatando casas decimais de numeros usando %.{tamanho que deseja}f  */

        System.out.printf("Salario: R$: %.1f %n%n", 1234.23);

        /* lidando com entradas */

        Scanner entrada = new Scanner(System.in); // pega inputs do usúario

        System.out.println("Escreva seu nome: ");
        String name  = entrada.nextLine(); // esta pegando strings 

        System.out.println("Escreva seu sobre nome: ");
        String sobrename  = entrada.nextLine(); // esta pegando strings 

        System.out.println("Escreva sua idade: ");
        int idade  = entrada.nextInt(); // como vai pegar um numero deve se espesficar
       

        System.out.printf("Olá %s %s você tem %d anos. %n", name, sobrename, idade);

        entrada.close(); // é necesario para finalizar o scanner
 
    }
    
}
