public class Carro extends Veiculo {

    private int portas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    // Sobrescrevendo o método descricao() da classe base
    @Override
    public String descricao() {
        return super.descricao() + " e tem " + portas + " portas.";
    }

    // Getter específico para Carro
    public int getPortas() {
        return portas;
    }

    // Setter específico para Carro
    public void setPortas(int portas) {
        this.portas = portas;
    }
}