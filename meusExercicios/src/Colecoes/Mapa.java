package Colecoes;



import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuario = new HashMap<>();
        usuario.put(1, "Roberto");
        usuario.put(2, "Ricardo");
        usuario.put(3, "Rafaela");
        usuario.put(4, "Rebeca");

        /* metodos de controle */

        System.out.println(usuario.size()); // 4
        System.out.println(usuario.isEmpty()); // false

        System.out.println(usuario.keySet()); // [1, 2, 3, 4]
        System.out.println(usuario.values()); // [Roberto, Ricardo, Rafaela, Rebeca]
        System.out.println(usuario.entrySet()); // [1=Roberto, 2=Ricardo, 3=Rafaela, 4=Rebeca]

        System.out.println(usuario.containsKey(3)); // true
        System.out.println(usuario.containsValue("Rebeca")); // true

        System.out.println(usuario.get(4)); // Rebeca
        System.out.println(usuario.remove(1)); // true -> removendo o Roberto dsa lista
        System.out.println(usuario.remove(2, "Maike")); // false, valor não existe no map

        /* percorrendo o map com for */

        /* percorrendo a chave do valor */
        for (int chave : usuario.keySet()) {
            System.out.println(chave);
        }

        /* percorrendo os valores de cada chave */
        for (String valor : usuario.values()) {
            System.out.println(valor);
        }

        /* percorendo os valores das chaves e valores do map ao mesmo tesmpo */
        for (Entry<Integer, String> registro : usuario.entrySet()) {
            System.out.print(registro.getKey() + "==> ");
            System.out.println(registro.getValue());
        }

    }
}
