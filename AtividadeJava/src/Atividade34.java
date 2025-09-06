import java.util.Scanner;
public class Atividade34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroLimite = scanner.nextInt();

        int contador = 0;

        System.out.println("Números pares até " + numeroLimite + ":");
        while (contador <= numeroLimite) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
        System.out.println();

        scanner.close();
    }
}