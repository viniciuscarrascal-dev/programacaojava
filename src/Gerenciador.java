import java.util.List;

public class Gerenciador {
    private List<Tutor> tutor;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Tutor> getTutores() {
        return tutor;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setTutores(List<Tutor> tutores) {
        this.tutor = tutores;
    }

}
