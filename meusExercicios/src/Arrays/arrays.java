package Arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.5;
        notasAlunoA[1] = 4.5;
        notasAlunoA[2] = 9.5;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalA = 0;
    
        for(int i = 0; i < notasAlunoA.length ; i++) {
            totalA += notasAlunoA[i];
        }

        System.out.println(totalA / notasAlunoA.length);

        double notaArmazenada = 5.3;

        double[] notasAlunoB = {8.2, notaArmazenada, 2.1, 3.2};

        double totalB = 0;

        for(int i = 0; i < notasAlunoB.length ; i++) {
            totalB += notasAlunoB[i];
        }

        System.out.println(totalB / notasAlunoB.length);
    }
}
