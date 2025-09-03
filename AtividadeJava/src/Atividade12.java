import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int x = 0, y = 0;
        double divisão = 0, resto = 0;
        System.out.println("Digite dois valores para saber a sua divisão e resto");

        x = leia.nextInt();
        y = leia.nextInt();

        divisão = x / y;
        resto = x % y;
        System.out.println("O resultado da divisão é: " + divisão + "\n" +
                "O resto da divisão é: " + resto);
    }
}