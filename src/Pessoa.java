public abstract class Pessoa {
    private String nome;
    private int telefone;
    private int contador;

    public Pessoa (String nome, int telefone, int contador){
        this.nome = nome;
        this.telefone = telefone;
        this.contador++;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "contador=" + contador +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
