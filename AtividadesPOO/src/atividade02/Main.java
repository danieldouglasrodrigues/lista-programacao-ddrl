package atividade02;

public class Main {
    public static void main(String[] args) {
        // Criação de duas contas bancárias
        ContaBancaria contaAna = new ContaBancaria("Ana Silva", "12345-6", 500.00);
        ContaBancaria contaBruno = new ContaBancaria("Bruno Costa", "78901-2", 200.00);
        System.out.println("--- Status Inicial das Contas ---");
        System.out.println("Conta de Ana: Número " + contaAna.getNumero() + ", Saldo R$" + contaAna.getSaldo());
        System.out.println("Conta de Bruno: Número " + contaBruno.getNumero() + ", Saldo R$" + contaBruno.getSaldo());
        System.out.println("----------------------------------\n");
        // Demonstração de depósito
        System.out.println("--- Operação: Depósito na conta de Ana ---");
        contaAna.depositar(150.00);
        System.out.println("Novo saldo de Ana: R$" + contaAna.getSaldo() + "\n");
        // Demonstração de saque
        System.out.println("--- Operação: Saque na conta de Ana ---");
        contaAna.sacar(75.00);
        System.out.println("Novo saldo de Ana: R$" + contaAna.getSaldo() + "\n");
        // Demonstração de transferência
        System.out.println("--- Operação: Transferência de Ana para Bruno ---");
        contaAna.transferir(contaBruno, 300.00);
        System.out.println("Novo saldo de Ana: R$" + contaAna.getSaldo());
        System.out.println("Novo saldo de Bruno: R$" + contaBruno.getSaldo() + "\n");
        // Tentativa de saque e transferência falhos
        System.out.println("--- Teste de regras de negócio ---");
        System.out.println("Tentando sacar mais do que o saldo de Bruno:");
        contaBruno.sacar(500.00);
        System.out.println("Saldo de Bruno: R$" + contaBruno.getSaldo() + "\n");
        System.out.println("Tentando transferir valor inválido:");
        contaAna.transferir(contaBruno, -100.00);
    }
}
