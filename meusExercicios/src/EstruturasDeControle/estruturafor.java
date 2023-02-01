package EstruturasDeControle;

public class estruturafor {
    public static void main(String[] args) {

        int contador = 10;

        for(int i = 0; i <= contador; i++) {
           System.out.println("Bom dia!");
        }
        
        int x = 2;
        for (;x < 10;) {
          System.out.println("x = " + x);
          x++;
        }

        //loop infinito 

        for(;true;) {
           System.out.println("infinito oo");
        }
    }
}
