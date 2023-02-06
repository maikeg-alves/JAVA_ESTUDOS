package Arrays;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = { 2.1, 7.2, 9.1, 5.2 };

        // diferença de uma estrura for para um foreach

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        for (double nota : notas) {
            System.out.print(nota + " ");
        }
    }
}
