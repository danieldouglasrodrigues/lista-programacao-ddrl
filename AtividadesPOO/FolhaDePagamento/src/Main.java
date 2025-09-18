public class Main {
    public static void main(String[] args) {
        // Instanciando os diferentes tipos de funcionários
        Funcionario funcionarioGenerico = new Funcionario("João", 3000.00);
        Vendedor vendedor = new Vendedor("Maria", 2500.00, 500.00);
        Gerente gerente = new Gerente("Carlos", 5000.00, 1500.00);
        // Criando uma instância da classe Folha
        Folha folhaDePagamento = new Folha();
        // Demonstração do Polimorfismo
        System.out.println("--- Processando a Folha de Pagamento ---");
        // O método 'pagar' aceita qualquer objeto que seja um 'Funcionario'
        // Em tempo de execução, o Java sabe qual método 'calcularPagamento' chamar
        folhaDePagamento.pagar(funcionarioGenerico);
        folhaDePagamento.pagar(vendedor);
        folhaDePagamento.pagar(gerente);
    }
}