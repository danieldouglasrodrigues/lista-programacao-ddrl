package atividade03;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    // Sobrescrevendo o método descricao() da classe base
    @Override
    public String descricao() {
        return super.descricao() + " e tem " + cilindradas + " cilindradas.";
    }

    // Getter específico para Moto
    public int getCilindradas() {
        return cilindradas;
    }

    // Setter específico para Moto
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}