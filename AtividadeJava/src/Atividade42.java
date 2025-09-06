import java.util.Scanner;
public class Atividade42 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("\nOs números pares que você digitou são:");
        for (int i = 0; i < 10; i++) {
            // Usa o operador de módulo (%) para verificar se o número é par.
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}