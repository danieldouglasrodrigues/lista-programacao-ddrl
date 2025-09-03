import java.util.Scanner;
public class Atividade16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de um número para saber seu quadrado");
        double num = leia.nextDouble();
        System.out.println("O quadrado deste número é: "+(num*num));
    }
}