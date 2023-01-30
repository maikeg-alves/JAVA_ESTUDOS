package fundamentos;

public class Ternario {
    public static void main(String[] args) {
        double media = 6.0;
        String resultadoRecuperacao = media >= 5.0 ? "em recuperação." : "reprovado.";
        String resultado = media >= 7.0 ? "aprovado." : resultadoRecuperacao;
        
        System.out.println("O aluno está " + resultado);


        double nota = 4.7;
        boolean bomCompotamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomCompotamento && passouPorMedia;
        String resultadoDesconto = temDesconto ? "Sim" : "Não";

        System.out.printf("Tem desconto ? %s", resultadoDesconto );
    }
}
