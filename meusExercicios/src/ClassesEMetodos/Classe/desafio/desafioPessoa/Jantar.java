package ClassesEMetodos.Classe.desafio.desafioPessoa;

public class Jantar {
    public static void main(String[] args) {
        
     Comida c1 = new Comida("arroz", 0.260);
     Comida c2 = new Comida("feijão", 0.347);
     Comida c3 = new Comida("carne", 0.143);


     Pessoa pessoa = new Pessoa("Paulo", 17, 75);
     


     System.out.print("\nAntes do Jantar: ");
     System.out.println(pessoa.apresentarPessoa());

     pessoa.comer(c1);
     pessoa.comer(c2);
     pessoa.comer(c3);
     
     System.out.print("\nDepois de jantar: ");
     System.out.print(pessoa.apresentarPessoa());


    }
}
