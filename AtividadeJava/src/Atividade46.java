import java.util.Scanner;
public class Atividade46 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] numeros = new int[2][2];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Digite o valor:");
                numeros[i][j] = leia.nextInt();
                soma += numeros[i][j];
            }
        }
        System.out.println("A soma de todos os valores do vetor é:" + soma);
    }
}