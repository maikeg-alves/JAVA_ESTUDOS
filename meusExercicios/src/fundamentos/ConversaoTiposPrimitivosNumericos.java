package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; // conversão implicita 
        System.out.println(a);

        // assim vc força o java a converter valores mesmo sabendo das pssiveis perdas
        float b = (float) 1.0; // conversão explicita
        System.err.println(b);

        //só não faça isso
        int c = 130;
        byte d = (byte) c; // conversão explicita (CAST)
        System.out.println(d);

        // nesse tipo de conversão valores são perdidos 
        double e = 1.999;
        int f = (int) e; // conversão explicita (CAST)
        System.out.println(f);
    }
}
