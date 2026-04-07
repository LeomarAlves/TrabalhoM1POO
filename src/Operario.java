public class Operario extends Empregado {
    private double valorHoraExtra;
    private int horasExtras;

    public Operario(String nome, int telefone, int contador, int codigoSetor, double salarioBase, double imposto, double valorHoraExtra, int horasExtras) {
        super(nome, telefone, contador, codigoSetor, salarioBase, imposto);
        this.valorHoraExtra = valorHoraExtra;
        this.horasExtras = horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorHoraExtra * horasExtras);
    }
}
