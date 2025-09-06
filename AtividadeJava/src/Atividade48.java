import java.util.Scanner;
public class Atividade48 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int maiorValor = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite 16 números inteiros para preencher a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        System.out.println("\n--- Resultado ---");
        System.out.println("O maior valor encontrado na matriz é: " + maiorValor);
        System.out.println("Sua posição é: [" + linhaMaior + "][" + colunaMaior + "]");
    }
}