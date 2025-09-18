public class Main {
    public static void main(String[] args) {
        // Demonstração da Lâmpada 1 (usando construtor padrão)
        System.out.println("--- Lâmpada 1 (Lâmpada do Quarto) ---");
        Lampada lampadaQuarto = new Lampada();
        System.out.println("Estado inicial: Ligada = " + lampadaQuarto.isLigada() + ", Brilho = " + lampadaQuarto.getBrilho() + ", Cor = " + lampadaQuarto.getCor());
        lampadaQuarto.ligar();
        lampadaQuarto.aumentarBrilho(50);
        lampadaQuarto.mudarCor("amarela");
        System.out.println("Estado atual: Ligada = " + lampadaQuarto.isLigada() + ", Brilho = " + lampadaQuarto.getBrilho() + ", Cor = " + lampadaQuarto.getCor());
        System.out.println("\n--- Tentando ações com a lâmpada desligada ---");
        lampadaQuarto.desligar();
        lampadaQuarto.aumentarBrilho(20);
        System.out.println("---");
        // Demonstração da Lâmpada 2 (usando construtor completo)
        System.out.println("\n--- Lâmpada 2 (Lâmpada da Sala) ---");
        Lampada lampadaSala = new Lampada(true, 75, "azul");
        System.out.println("Estado inicial: Ligada = " + lampadaSala.isLigada() + ", Brilho = " + lampadaSala.getBrilho() + ", Cor = " + lampadaSala.getCor());
        lampadaSala.reduzirBrilho(30);
        lampadaSala.mudarCor("roxa");
        lampadaSala.desligar();
        System.out.println("---");
        // Demonstração de validação do brilho
        System.out.println("\n--- Testando a validação do brilho ---");
        lampadaQuarto.ligar();
        lampadaQuarto.aumentarBrilho(200); // Tenta um valor acima de 100
        System.out.println("Brilho após tentativa de 200: " + lampadaQuarto.getBrilho());
        lampadaQuarto.reduzirBrilho(300); // Tenta um valor abaixo de 0
        System.out.println("Brilho após tentativa de -100: " + lampadaQuarto.getBrilho());
    }
}