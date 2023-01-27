package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        /*
         * dessa forma podemos converter numeros para string e podemos utilizar dos
         * metodos empregados apenas nas strings
         */
        Integer num1 = 1000;
        System.out.println(num1.toString().length());

        /*
         * podemos tbm converter apartir do proprio metodos, por exemplo :
         * tipo.metodo(variavel).metodo()
         */

        int num2 = 1000;
        System.out.println(Integer.toString(num2).length());
    }
}
