package fundamentos;

public class Relacionais {
    public static void main(String[] args) {

        /// não utlize isso nunca ❌
        
        int a = 97;
        int b = 'a';

        System.out.println( a == b); //true

        System.out.println( 3 > 4); //false
        System.out.println( 3 >= 4); // false
        System.out.println( 3 < 4); //true
        System.out.println( 30 <= 7); //false
        System.out.println( 30 != 7); // true


        // exemplo de operadores relacionais 

        double nota = 9.7;
        boolean bomCompotamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomCompotamento && passouPorMedia; 

        System.out.printf("Tem desconto ? %b", temDesconto );
    }
    
}
