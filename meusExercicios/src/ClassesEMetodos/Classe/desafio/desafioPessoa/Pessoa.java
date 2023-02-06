package ClassesEMetodos.Classe.desafio.desafioPessoa;

public class Pessoa {

    String nome;
    int idade;
    double peso;

    Pessoa() {
        this("João", 27, 75.0);
    }

    Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    String apresentarPessoa() {
        return String.format("\n Nome: %s\n Idade: %d anos\n Peso: %.2f Kg", nome, idade, peso);
    }

    double comer(Comida comida ) {
        if (comida != null ) {
            double aumentoDePeso = comida.calorias / 7700;
            return  peso = peso + aumentoDePeso;
        }
        
        return peso;
    }
    
}
