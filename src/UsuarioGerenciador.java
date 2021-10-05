public abstract class UsuarioGerenciador {
    protected String nome;
    private String usuario;
    private String senha;
    protected int id;

    public UsuarioGerenciador() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
