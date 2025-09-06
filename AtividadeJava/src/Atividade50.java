import java.util.Scanner;
public class Atividade50 {
    public static void main(String[] args) {
        int[][] matrizOriginal = new int[3][3];
        int[][] matrizQuadrado = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite 9 números inteiros para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = sc.nextInt();
                matrizQuadrado[i][j] = matrizOriginal[i][j] * matrizOriginal[i][j];
            }
        }
        System.out.println("\n--- Matriz Original ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizOriginal[i][j] + "\t");
            }
            System.out.println(); // Quebra de linha para a próxima linha da matriz.
        }
        System.out.println("\n--- Matriz com os Valores ao Quadrado ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizQuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}