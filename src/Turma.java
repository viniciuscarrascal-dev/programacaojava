import java.util.List;
import java.util.Map;

public class Turma {
    private Disciplina disciplina;
    private Tutor tutor;
    private int provas;
    private List<Aluno> alunos;
    private List<Atividade> atividades;
    private Map<Aluno, List<Double>> notas;

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public int getProvas() {
        return provas;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public Map<Aluno, List<Double>> getNotas() {
        return notas;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setNotas(Map<Aluno, List<Double>> notas) {
        this.notas = notas;
    }

    public void setProvas(int provas) {
        this.provas = provas;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
