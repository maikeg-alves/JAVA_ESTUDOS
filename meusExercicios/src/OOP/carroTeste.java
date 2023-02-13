package OOP;

public class carroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.ligar();

        System.out.println("O carro está ligado" + (c1.estaLigado() ? "sim" : "não") + ".");

        System.out.println("Girros atuais " + c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Giros após aceleração " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println("Giros após frear " + c1.motor.giros());
    }
}
