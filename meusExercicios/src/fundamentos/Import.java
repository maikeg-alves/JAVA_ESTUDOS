package fundamentos;

import java.util.Date; // assim que se importa libs dentro do java 

public class Import {
    public static void main(String[] args) {

        Date d = new Date();

        String a = "Bom dia, hoje é X".replace("X", d.toString());
        System.out.println(a);
        
    }
}
