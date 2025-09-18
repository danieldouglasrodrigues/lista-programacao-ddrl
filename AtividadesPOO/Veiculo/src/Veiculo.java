public class Veiculo {
    private String marca;
    private String modelo;
    private double velocidade;
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0.0;
    }
    // --- Métodos de Ação ---
    public void acelerar(double valor) {
        if (valor > 0) {
            this.velocidade += valor;
            System.out.println(this.modelo + " acelerou para " + this.velocidade + " km/h.");
        }
    }
    public void frear(double valor) {
        if (valor > 0 && this.velocidade - valor >= 0) {
            this.velocidade -= valor;
            System.out.println(this.modelo + " freou para " + this.velocidade + " km/h.");
        } else {
            this.velocidade = 0.0;
            System.out.println(this.modelo + " freou completamente e parou.");
        }
    }
    public String descricao() {
        return "Veículo [Marca: " + marca + ", Modelo: " + modelo + ", Velocidade: " + velocidade + " km/h]";
    }
    // --- Getters e Setters ---
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getVelocidade() {
        return velocidade;
    }
    // Não há setter direto para velocidade, ela é alterada pelos métodos acelerar/frear
}