package fundamentos;

public class Logicos {
    public static void main(String[] args) {
        boolean condiciona1 = true;
        boolean condiciona2 = 3 < 7; 

        System.out.println(condiciona1 && !condiciona2);
        System.out.println(condiciona1 || condiciona2);
        System.out.println(condiciona1 != condiciona2);
        System.out.println(condiciona1 ^ condiciona2);
        System.out.println(!!condiciona1);
        System.out.println(!condiciona2);

        System.out.println("\n======= tabela verdade E (AND) =====");

        System.out.println(true && true);
        System.out.println(true && false);
     // System.out.println(false && true); //Dead code
     // System.out.println(false && false); //Dead code

        System.out.println("\n======= tabela verdade OU (OR) =====");

     // System.out.println(true || true); //Dead code 
     // System.out.println(true || false); //Dead code
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\n======= tabela verdade OU Exclusivo (XOR) =====");

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\n======= tabela verdade NOT =====");

        System.out.println(!true);
        System.out.println(!false);

    }
}
