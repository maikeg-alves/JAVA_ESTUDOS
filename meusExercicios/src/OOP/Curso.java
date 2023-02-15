package OOP;

import java.util.ArrayList;
import java.util.List;

import fundamentos.TipoString;

public class Curso {

    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    void addcionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    public String ToString() {
        return nome;
    }
}
