import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a = 0, b = 0, c = 0, d = 0;
        double r = 0;
        System.out.println("Digite quatro valores para saber a sua 'precedência de operadores'");
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();

        r = (a + b) * c - d;
        System.out.println("O resultado é: " + r);
    }
}