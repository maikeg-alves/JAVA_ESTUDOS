package OOP.Composicao;

public class Motor {

    boolean ligado = false;
    double fatorIjecao = 1;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorIjecao * 3000);
        }
    }

}
