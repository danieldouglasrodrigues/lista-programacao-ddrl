package atividade04;

public class Vendedor extends Funcionario {
    private double comissao;
    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public double calcularPagamento() {
        return getSalarioBase() + comissao;
    }
}