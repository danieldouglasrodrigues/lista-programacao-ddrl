package exemplo04_heranca_polimorfismo;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int valor) {
        this.idade = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void falar() {
        System.out.println("Oi, eu sou " + this.nome + ". Eu tenho " + this.idade + " de idade");
    }


}