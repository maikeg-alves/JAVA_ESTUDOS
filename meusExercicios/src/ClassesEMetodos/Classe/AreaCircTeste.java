package ClassesEMetodos.Classe;

public class AreaCircTeste {
    
    
    public static void main(String[] args) {

        /* usando e atribuindo as estancias ao metodo */
        AreaCirc a1 = new AreaCirc();
        a1.raio = 10;

        System.out.println(a1.Area());

        // chamando diretamne pela clase acessando metodo estatico 
        System.out.println(AreaCirc.Area(100));
        // visualizando a instancia estatica 
        System.out.println(AreaCirc.PI); 
    }
}
