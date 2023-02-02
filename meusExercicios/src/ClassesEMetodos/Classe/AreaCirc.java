package ClassesEMetodos.Classe;

public class AreaCirc {

    double raio; // instaciia a ser a tribuida
    final static double PI = 3.1415; // Esse valor vai pertencer a classe, ao atribuir "FINAL" ela se torna uma
                                     // CONSTANTE

    double Area() {
        return PI * Math.pow(raio, 2); // = PI * raio * raio
    }

    // metodo estatico
    /*
     * o metodo pode ser chamada sem nececidade de ser atribuido em uma varaivel por
     * exemplo:
     * var area = new Area(); ❌ agora ele pode ser chamdo assim: 
     * AreaCirc.Area(valor do cario); ✅.
     */

    static double Area(double raio) {
        return PI * Math.pow(raio, 2);
    }

}