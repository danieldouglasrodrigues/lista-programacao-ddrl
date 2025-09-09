package exemplo02_acoes;
import java.util.Scanner;
public class Exemplo02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "José";
        pessoa.idade = 47;
        pessoa.falar();
    }
}