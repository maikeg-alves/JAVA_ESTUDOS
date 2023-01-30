package fundamentos;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...");
        System.out.println(a++ == --b); //true, o valor de --b é lido mais rapido que a comparação por isso é lido como verdadeiro.
        System.out.println(a++ == b--);// false, aqui os operadores são os mesmo e da o real resultado. 
    }
}
