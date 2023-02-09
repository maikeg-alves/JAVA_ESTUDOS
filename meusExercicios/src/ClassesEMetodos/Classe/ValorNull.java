package ClassesEMetodos.Classe;


public class ValorNull {
    public static void main(String[] args) {
        // vc deve inicializar todos os valores d dentro de um metodo, diferente das
        // instacias das classes

        String s1 = ""; // " "
        System.out.println(s1.concat("!!!")); // !!!!

        /* ❌ Erro de inicialização pq a variavel nunca foi atribuida a nada */
        /*
         * String s2; // null
         * System.out.println(s2.concat("!!!")); // error ❌
         */

    }
}
