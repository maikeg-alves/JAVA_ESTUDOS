package ClassesEMetodos.Classe.desafio.desafiodata;

import java.util.Scanner;


public class DataTeste {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Data mydata = new Data();
        
        System.out.print("Digite o dia: ");
        mydata.Dia = entrada.nextInt();

        System.out.print("Digite o mês: ");
        mydata.Mes = entrada.nextInt();

        System.out.print("Digite o ano: ");
        mydata.Ano = entrada.nextInt();


        System.out.printf("%d/%d/%d", mydata.Dia, mydata.Mes, mydata.Ano);
        
        entrada.close();
    }
}
