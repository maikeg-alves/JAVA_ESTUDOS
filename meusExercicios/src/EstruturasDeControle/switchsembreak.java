package EstruturasDeControle;

public class switchsembreak {
    public static void main(String[] args) {

        String faixa = "roxo";

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
