import java.util.Scanner;
public class Atividade41 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("\nOs números que você digitou são:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}