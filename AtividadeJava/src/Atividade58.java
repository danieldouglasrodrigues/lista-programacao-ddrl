import java.util.Scanner;

public class Atividade58 {
    public static void imprimeMatriz(int[][] matriz) {
        // verifica se número de linhas e colunas são iguais
        if (matriz.length == matriz[0].length) {
            for (int l = 0; l < matriz.length; l++) {
                String linha = "";
                for (int c = 0; c < matriz[l].length; c++) {
                    linha += "[" + matriz[l][c] + "]";
                }
                System.out.println(linha);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};
        imprimeMatriz(matriz);
    }

}