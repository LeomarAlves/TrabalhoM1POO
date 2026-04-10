public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, int telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (this.valorVendas * (this.comissao/100.0));
    }
}
