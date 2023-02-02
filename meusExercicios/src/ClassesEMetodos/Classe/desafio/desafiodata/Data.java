package ClassesEMetodos.Classe.desafio.desafiodata;

public class Data {

    // atributos 
    int Dia;
    int Mes;
    int Ano;

    Data () {
       Dia = 01;
       Mes = 01;
       Ano = 1970; 
    }

    Data(Integer diaInicial, Integer mesInicial, Integer anoInicial) {
        Dia = diaInicial;
        Mes = mesInicial;
        Ano = anoInicial;
    }

    String dataFormatada() {
        return Dia + "/" + Mes + "/" + Ano;
    }

    // chamando um metodo  de detro da classse 
    void imprimirDataFormatada() {
        System.out.println(dataFormatada());
    }

} 