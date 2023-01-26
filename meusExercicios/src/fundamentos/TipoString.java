package fundamentos;

public class TipoString {

    public static void main(String[] args) {

        /*
         * não é necesario declrara uma variavel para utilizar as funcionalidade da
         * string
         */
        System.out.println("Olá, pessoal".charAt(2));

        String s = "Bom dia"; // strings são imutaveis não podem ser reatribuidas
        /* String s = "Boa tarde"; // não pode fazer isso ❌ */

        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("bom")); // verificando se tem a palavra
        System.out.println(s.toLowerCase().startsWith("bom"));
        System.out.println(s.toLowerCase().endsWith("dia"));
        System.out.println(s.length() != 7 ? "funfa não" : "funfa sim");
        System.out.println(s.equals("bom dia"));
        System.out.println(s.equalsIgnoreCase("bom dia")); // verificanso se é a mesma coisa ignorando a case

        String nome = "Maicon";
        String sobrenome = "Gabriel Alves";
        int idade = 24;
        double salario = 11504.546;

        /*
         * simplficando a forma de imprimir valore, dessa forma não é necesario
         * concatenar da forma convencional
         */
        
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

        System.out.printf("O Senhor %s %s de %d Anos, hoje ganha R$ %.2f", nome, sobrenome, idade, salario);

        // tambem pode ser usado assim

        String frase = String.format("\nO Senhor %s %s de %d Anos, hoje ganha R$ %.2f", nome, sobrenome, idade, salario);



        System.out.println(frase);
    }

}
