package atividade02;

public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo;
    // Construtor padrão
    public ContaBancaria() {
        this.saldo = 0.0;
    }
    // Construtor completo
    public ContaBancaria(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }
    // --- Métodos de Ação ---
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Valor de depósito inválido. Deve ser maior que zero.");
            return false;
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque falhou. Saldo insuficiente ou valor inválido.");
            return false;
        }
    }
    public boolean transferir(ContaBancaria destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.getNumero() + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente ou valor inválido.");
            return false;
        }
    }
    // --- Getters ---
    public String getTitular() {
        return titular;
    }
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}