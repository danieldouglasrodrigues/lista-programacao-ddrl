package atividade04;

public class Folha {
    public void pagar(Funcionario f) {
        System.out.printf("Pagando o salário de %s: R$%.2f\n", f.getNome(), f.calcularPagamento());
    }
}