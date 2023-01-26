package fundamentos;

public class TipoPrimitivos {
    public static void main(String[] args) {
        //tipos numericos inteiros 
        byte anosEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 567521; 
        long pontosAcumulados = 3_105_321_2231L; // qaundo passa do range se utiliza "L" para defirir que é long

        //tipos numericos reais 
        float salario = 11_455.43F;
        double vendasAcumuladas = 1_992_232_312.11;

        // tipo boolean 
        boolean estaDeFerias = false; // true

        // tipo caracrete 
        char status = 'A'; // char aceita apenas um valor seja ele qual for

        // Dias de trabanho
        System.out.println("anos de empres " + anosEmpresa * 365); 

        // numeros de voos 
        System.out.println("numero de viagens " + numeroDeVoos / 2 );

        // pontos por real 
        System.out.println("pontos por real " + pontosAcumulados / vendasAcumuladas);

        // dados do usuario 
        System.out.println("o usúario de id: " + id + " ganha R$ " + salario  );
        System.out.println("Status Férias: " + estaDeFerias + "Situação na empresa: " + status );
    }
}
