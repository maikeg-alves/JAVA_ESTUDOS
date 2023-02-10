package ClassesEMetodos.EqualEHashcode;

public class User {
    String nome;
    String email;

    public boolean Equals(Object object) {

        if (object instanceof User) {

            User outro = (User) object;
 
            return outro.nome.equals(this.nome) && outro.email.equals(this.email);
        }

        return false;
    }
}
