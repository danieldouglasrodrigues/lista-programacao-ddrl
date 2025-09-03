import java.util.Scanner;
public class Atividade17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga o valor de n: ");
        double n = leia.nextDouble();
        double quadrado = n*n;
        System.out.println("O valor de n ao quadrado é: "+quadrado);
    }
}