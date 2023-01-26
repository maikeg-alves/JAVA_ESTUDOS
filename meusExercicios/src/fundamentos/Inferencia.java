package fundamentos;

public class Inferencia {

    
    public static void main(String[] args) {
        double a = 4.5; // atribuindo valor e tipo  
        System.out.println(a);

        var b = 4.6; // variavel por inferencia, o java descobre que tipo de varaivel é 
        System.out.println(b);

        /* var c; */ // ❌ vc precisa atribuir um valor as variaveis inferidas;

        double d;
        d = 4.596;
        System.out.println(d); // já varaiveis pre atribuidas não tem problema se não atribuir um valor 
        
    }
    
}
