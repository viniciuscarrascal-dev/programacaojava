import java.util.List;

public class Tutor extends UsuarioGerenciador {
    private List<Turma> turmas;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
