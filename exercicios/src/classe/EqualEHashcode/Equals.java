package classe.EqualEHashcode;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {

       User u1 = new User();
       u1.nome = "João Paulo";
       u1.email = "joao@gmail.com";

       User u2 = new User();
       u2.nome = "João Paulo";
       u2.email = "joao@gmail.com";

       System.out.println(u1 == u2);
       System.out.println(u1.equals(u2));
       System.out.println(u1.Equals(u2));
       System.out.println(u1.Equals(new Date()));

    }
}
