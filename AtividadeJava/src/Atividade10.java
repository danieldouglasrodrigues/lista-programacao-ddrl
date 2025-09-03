import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;
        System.out.println("Digite quantos graus celsius está para saber a temp. em fahrenheit");
        celsius = leia.nextInt();
        fahrenheit = (9 * celsius) / 5 + 32;
        System.out.println("A sua temperatura em fahrenheit é: " + fahrenheit);
    }
}