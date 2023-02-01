package EstruturasDeControle;

public class switchsembreak {
    public static void main(String[] args) {

        /*
         * switchs sem breaks (ou quase isso), são bons para situações que outros
         * valores em uma fila são aplicaveis,
         * no exemplo fala sobre faixas e golpes, se vc tem a faixa preta logo sabe
         * todos os golpes a baixo dela
         */
        
         String faixa = "preta";

        switch (faixa) {
            case "preta":
                System.out.println("sei o bassai-dan");
            case "marron":
                System.out.println("sei o Tekki shodan");
            case "roxo":
                System.out.println("sei o Heian Godan");
            case "verde":
                System.out.println("sei o Heian Yodan");
            case "laranja":
                System.out.println("sei o Heian Sandan");
            case "vermelho":
                System.out.println("sei o Heian Nidan");
            case "amarelo":
                System.out.println("sei o Heian Hodan");
                break;
            default:
                System.out.println("Sei nada");

        }
    }
}
