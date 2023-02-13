package Colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Sarah"));

        /*
         * se o hascode não estivesse configurado corretamente ele daria falso mesmo o
         * nome estando presente  no banco de dados
         */

        boolean resultado = usuarios.contains(new Usuario("Sarah"));

        System.out.println(resultado); // true
    }
}
