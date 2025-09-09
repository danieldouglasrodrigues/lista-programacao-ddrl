package exemplo01_conceito_objetos;
import java.util.Scanner;
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Chamada e instanciação de um objeto
        Pessoa pessoa = new Pessoa();
        //Acesso e alteração direta de atributos
        pessoa.nome = "João";
        pessoa.idade = 16;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
    }
}