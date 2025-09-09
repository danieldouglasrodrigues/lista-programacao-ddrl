package exemplo03_encapsular_construtores_getsets;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Construtor
        Pessoa pessoa = new Pessoa("Diego",31);
        pessoa.falar();
        //Alteração do atributo com metodo set
        pessoa.setIdade(32);
        //Chamada do atributo com metodo get
        System.out.println("Correção, minha idade é " + pessoa.getIdade());
        String nomeAnterior = pessoa.getNome();
        pessoa.setNome("Michael");
        System.out.println("Nome anterior: " + nomeAnterior);
        System.out.println("Novo nome:" + pessoa.getNome());
        pessoa.falar();
    }
}