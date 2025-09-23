package atividade03;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando um Carro ---");
        // Criando uma referência do tipo Carro
        Carro meuCarro = new Carro("Honda", "Civic", 4);
        meuCarro.acelerar(50);
        System.out.println(meuCarro.descricao());
        System.out.println("\n--- Criando uma Moto ---");
        // Criando uma referência do tipo Moto
        Moto minhaMoto = new Moto("Yamaha", "MT-07", 689);
        minhaMoto.acelerar(80);
        System.out.println(minhaMoto.descricao());
        System.out.println("\n--- Demonstração de Polimorfismo ---");
        // Declarando uma referência do tipo da classe base (Veiculo)
        Veiculo veiculoGenerico;
        // A referência aponta para um objeto do tipo Carro
        System.out.println("A referência 'veiculoGenerico' aponta para um Carro.");
        veiculoGenerico = meuCarro;
        System.out.println(veiculoGenerico.descricao());
        // A mesma referência agora aponta para um objeto do tipo Moto
        System.out.println("\nA referência 'veiculoGenerico' agora aponta para uma Moto.");
        veiculoGenerico = minhaMoto;
        System.out.println(veiculoGenerico.descricao());
    }
}