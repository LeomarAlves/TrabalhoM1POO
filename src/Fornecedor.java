public class Fornecedor extends Pessoa{
    private float valorDivida;
    private float valorCredito;

    public Fornecedor(String nome, int telefone, float valorDivida, float valorCredito) {
        super(nome, telefone);
        this.valorDivida = valorDivida;
        this.valorCredito = valorCredito;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public float valorAPagar(float valorCredito, float valorDivida) {
        return valorCredito - valorDivida;
    }

}

