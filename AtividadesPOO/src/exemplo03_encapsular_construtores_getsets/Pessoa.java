package exemplo03_encapsular_construtores_getsets;

public class Pessoa {
    //Visibilidade de variáveis ou métodos
    //ENCAPSULAMENTO
    private String nome;
    private int idade;

    //CONSTRUTORES
    public Pessoa(){
        this.nome = "";
        this.idade = 0;
    }
    public Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
    //MÉTODOS GETS(ler) E SETS(mudar) para Ler ou Alterar um atributo
    //Get
    public int getIdade(){
        return this.idade;
    }
    //Set
    public void setIdade(int valor){
        this.idade = valor;
    }
    //Get e Sets para nome

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    //Ação simples, pessoa
    public void falar(){
        System.out.println("Oi, eu sou " + this.nome + ". Eu tenho " + this.idade +  " de idade" );
    }


}