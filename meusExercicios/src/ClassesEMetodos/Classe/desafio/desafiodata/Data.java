package ClassesEMetodos.Classe.desafio.desafiodata;

public class Data {

    // atributos
    int Dia;
    int Mes;
    int Ano;

    public Data() {
        /*
         * Dia = 01;
         * Mes = 01;
         * Ano = 1970;
         */
        this(01,01,1970); // pode usar o this para chamar metodos 
    }

    public Data(Integer Dia, Integer Mes, Integer Ano) {
        // podemos usar o this para pegar instancias da classe 
        this.Dia = Dia;
        this.Mes = Mes;
        this.Ano = Ano;

    }

    String dataFormatada() {
        return String.format("%d/%d/%d", Dia, Mes, Ano);
    }

    // chamando um metodo de detro da classse
    void imprimirDataFormatada() {
        System.out.println(this.dataFormatada()); // e tbm podemos chamar metodos das classes 
    }

}