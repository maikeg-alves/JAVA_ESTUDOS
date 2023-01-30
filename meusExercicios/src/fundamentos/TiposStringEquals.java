package fundamentos;

import java.util.Scanner;

public class TiposStringEquals {
    public static void main(String[] args) {

        /*
         * ⚠️ de sempre preferencia em usar "suaString.equals(strinQueDesejaComprara)"
         * inves de usar "suaString == strinQueDesejaComprara"
         * da menos erros e não da problemas ⚠️
         */

        System.out.println("2" == "2"); // true

        String s1 = new String("2");

        System.out.println(s1 == "2"); // false

        System.out.println("2".equals(s1)); // true, forma mais recomendada de comprara strings

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); // somente next remove espaços em brancos
        System.out.println("2" == s2.trim()); // false, trim remove os espaços
        System.out.println("2".equals(s2)); // true
        entrada.close();

    }
}
