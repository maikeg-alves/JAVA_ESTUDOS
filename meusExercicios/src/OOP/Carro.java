package OOP;

public class Carro {

    Motor motor = new Motor();

    void acelerar() {
        if (motor.fatorIjecao < 2.6)
            motor.fatorIjecao += 0.4;
    }

    void frear() {
        if (motor.fatorIjecao > 0.5)
            motor.fatorIjecao -= 0.4;
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

}
