import java.util.Scanner;

public class Atividade60 {
    public static void isTriangulo(int a, int b, int c) {
        boolean testeA = a < (b + c);
        boolean testeB = b < (a + c);
        boolean testeC = c < (b + a);
        if (testeA && testeB && testeC)
            System.out.println("Os lados informados podem formar um triângulo");
        else
            System.out.println("Os lados informados não podem formar um triângulo");
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do lado A");
        int ladoA = leia.nextInt();
        System.out.println("Digite o valor do lado B");
        int ladoB = leia.nextInt();
        System.out.println("Digite o valor do lado C");
        int ladoC = leia.nextInt();
        isTriangulo(ladoA,ladoB,ladoC);
    }
}
