import java.util.Map;

public class Historico {
    private Map<Disciplina, Character> conceitos;
    private int ContarTurmas;

    public Historico() {

    }

    public int getContarTurmas() {
        return ContarTurmas;
    }

    public Map<Disciplina, Character> getConceitos() {
        return conceitos;
    }

    public void setConceitos(Map<Disciplina, Character> conceitos) {
        this.conceitos = conceitos;
    }

    public void setContarTurmas(int contarTurmas) {
        ContarTurmas = contarTurmas;
    }
}
