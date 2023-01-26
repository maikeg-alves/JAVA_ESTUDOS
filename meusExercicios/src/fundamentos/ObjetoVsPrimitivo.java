package fundamentos;

public class ObjetoVsPrimitivo {
    public static void main(String[] args) {
        /*
         * tipos não primitos se comportão como classes contendo metodos e por sua vez
         * esses metodos são classes por exemplo 
         * String {
         *   toUpperCase(props),
         *   toLowerCase(props),
         *   ...etc
         * }
         */
        String s = new String("texto");
        s.toUpperCase();

        // Wrappers são a versão objeto dos tipos primitivos 
        int a = 123;
        System.out.println(a);
    }

}
