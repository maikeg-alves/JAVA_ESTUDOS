package fundamentos;

/**
 * AreaCircoverencia
 */
public class AreaCircoverencia {

    public static void main(String[] args) {
        // atribuindo uma variavel 
        // tipo > nome > valor 
        double raio = 3.4; // double para valores quebrados e int para valores inteiros, valor variavel 
        final double PI = 3.14159; // "final" define que o valor não pode ser reatribuido novamnete, valor constante

        double area = PI * raio * raio;
        
        System.out.println("o valor da area é " + area + " m2");
    }
}