import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0;
        System.out.println("Digite sua idade para saber sua idade em meses");
        idade = leia.nextInt();
        int idadeMeses = idade * 12;
        System.out.println("A sua idade em meses é igual a: " + idadeMeses);
    }
}