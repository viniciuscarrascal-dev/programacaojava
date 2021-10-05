import java.util.Map;

public class Atividade {
    private int inicio;
    private String descricao;
    private Map<Aluno, Boolean> listagem;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public Map<Aluno, Boolean> getListagem() {
        return listagem;
    }

    public void setListagem(Map<Aluno, Boolean> listagem) {
        this.listagem = listagem;
    }
}
