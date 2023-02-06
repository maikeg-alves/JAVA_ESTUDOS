package ClassesEMetodos.Classe.desafio.desafioPessoa;

public class Comida {
    String nome;
    double calorias;

    Comida (String nome, double valorNutricional) {
        this.nome = nome;
        this.calorias = valorNutricional;
    }

    String apresentarComida() {
        return String.format("\n Nome: %s \n Calorias: %.2f kcal", nome, calorias);
    }

}
