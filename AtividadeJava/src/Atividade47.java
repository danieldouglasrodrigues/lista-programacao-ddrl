import java.util.Scanner;
public class Atividade47 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz = {
                {0,1,2},
                {3,4,5},
                {6,7,8},
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                System.out.println("Digite o " + (i+1) + "° valor: ");
                matriz[i][j] = leia.nextInt();
            }
        }
        String resultado = "Diagonal principal: ";
        for (int i = 0; i < 3; i++) {
            resultado+= matriz[i][i] + "x' ";
        }
        System.out.println(resultado);
    }
}
