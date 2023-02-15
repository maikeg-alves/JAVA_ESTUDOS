package OOP;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pedrão");
        Aluno aluno2 = new Aluno("Ana");
        Aluno aluno3 = new Aluno("Pedrin");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Typescript");
        Curso curso3 = new Curso("Python");

        curso1.addcionarAluno(aluno3);
        curso2.addcionarAluno(aluno2);
        curso3.addcionarAluno(aluno1);

        for (Aluno aluno : curso1.alunos) {
            System.out.println(aluno.nome);
        }

        System.out.println(aluno1.obterCursoPorNome("Python").nome);

    }
}
