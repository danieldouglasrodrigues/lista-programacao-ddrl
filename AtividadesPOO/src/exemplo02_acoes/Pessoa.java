package exemplo02_acoes;
//Declaração de um objeto
public class Pessoa {
    //Declaração de atributos (variáveis ou constantes)
    String nome;
    int idade;
    //Ações (são os métodos)
    public void falar(){
        System.out.println("Oi, eu sou " + this.nome + ". Eu tenho " + this.idade +  " de idade" );
    }
}