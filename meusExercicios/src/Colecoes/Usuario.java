package Colecoes;

public class Usuario {
    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    /*
     * por padrão os tipos string chama p tostring, então podemos modificar o padrão
     * de de comportamento do memso e
     * e apresentar oq a gente acha melhor.
     */

    public String toString() {
        return "Meu nome é " + this.nome + "."; // apresenta a frase em seguida o nome do usuario
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object Objects) {
        if (Objects == this)
            return true;
        if (!(Objects instanceof Usuario)) {
            return false;
        }

        Usuario usuario = (Usuario) Objects;
        return usuario.nome.equals(this.nome);
    }

}