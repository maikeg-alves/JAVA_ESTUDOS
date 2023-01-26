package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        double a = 4.9;

        String b = "string se escreve assim X"; // String não é um palavra reservada
        b = b.replace("X", "Maicon"); // é necesario reatribuir a variavel com ela mesmo e com a função se não, não
                                      // funciona
        b = b.toUpperCase(); // ao utlizar o "ponto" em classes espesificas vc tem acesso a ferramentas e
                             // como toUpperCase e etc

        System.out.println("double: " + a);
        System.out.println("string: " + b);

        /*
         * outro exemplo, vc pode acionar os metodos na
         * declaração da variavel ou dentro da chamda dela
         */

        String w = "Nome do usúario: X"
                .replace("X", "maike")
                .concat(" !!!");

        System.out.println(w.toUpperCase());

    }

}