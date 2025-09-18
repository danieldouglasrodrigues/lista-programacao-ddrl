public class Lampada {
    private boolean ligada;
    private int brilho;
    private String cor;
    // Construtor padrão
    public Lampada() {
        this.ligada = false;
        this.brilho = 0;
        this.cor = "branca";
    }
    // Construtor completo
    public Lampada(boolean ligada, int brilho, String cor) {
        this.ligada = ligada;
        setBrilho(brilho); // Usamos o setter para garantir a validação
        this.cor = cor;
    }
    // --- Métodos de ação ---
    public void ligar() {
        if (!this.ligada) {
            this.ligada = true;
            System.out.println("A lâmpada foi ligada.");
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }
    public void desligar() {
        if (this.ligada) {
            this.ligada = false;
            setBrilho(0); // Garante que o brilho seja 0 ao desligar
            System.out.println("A lâmpada foi desligada.");
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }
    public void aumentarBrilho(int valor) {
        if (this.ligada) {
            setBrilho(this.brilho + valor);
            System.out.println("Brilho aumentado para " + this.brilho + ".");
        } else {
            System.out.println("Não é possível aumentar o brilho, a lâmpada está desligada.");
        }
    }
    public void reduzirBrilho(int valor) {
        if (this.ligada) {
            setBrilho(this.brilho - valor);
            System.out.println("Brilho reduzido para " + this.brilho + ".");
        } else {
            System.out.println("Não é possível reduzir o brilho, a lâmpada está desligada.");
        }
    }
    public void mudarCor(String novaCor) {
        if (this.ligada) {
            this.cor = novaCor;
            System.out.println("Cor alterada para " + this.cor + ".");
        } else {
            System.out.println("Não é possível mudar a cor, a lâmpada está desligada.");
        }
    }
    // --- Getters e Setters com validação ---
    public boolean isLigada() {
        return ligada;
    }
    public int getBrilho() {
        return brilho;
    }
    public void setBrilho(int brilho) {
        if (brilho < 0) {
            this.brilho = 0;
        } else if (brilho > 100) {
            this.brilho = 100;
        } else {
            this.brilho = brilho;
        }
    }
    public String getCor() {
        return cor;
    }
}