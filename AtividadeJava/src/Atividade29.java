import java.util.Scanner;
public class Atividade29 {
    public static double soma(double x, double y) {
        return x + y;
    }
    public static double subtracao(double x, double y) {
        return x - y;
    }
    public static double multiplicacao(double x, double y) {
        return x * y;
    }
    public static double divisao(double x, double y) {
        return x / y;
    }
    public static void printResultado(char op, double x, double y, double resultado) {
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("Escolha uma das opções abaixo");
            System.out.println(
                    "1 - Soma\n" +
                            "2 - Subtração\n" +
                            "3 - Multiplicação\n" +
                            "4 - Divisão\n");
            opcao = leia.nextInt();
            double x = 0;
            double y = 0;
            switch (opcao) {
                case 1:
                    System.out.println("Digite os números para a soma (x + y)");
                    System.out.println("Digite o valor de x: ");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor de y:");
                    y = leia.nextDouble();
                    printResultado('+', x, y, soma(x, y));
                    break;
                case 2:
                    System.out.println("Digite os números para a subtração (x - y)");
                    System.out.println("Digite o valor de x:");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor de y:");
                    y = leia.nextDouble();
                    printResultado('-', x, y, subtracao(x, y));
                    break;
                case 3:
                    System.out.println("Digite os números para a multiplicação (x * y)");
                    System.out.println("Digite o valor de x:");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor de y:");
                    y = leia.nextDouble();
                    printResultado('*', x, y, multiplicacao(x, y));
                    break;
                case 4:
                    System.out.println("Digite os números para a divisão (x / y)");
                    System.out.println("Digite o valor de x:");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor de y:");
                    y = leia.nextDouble();
                    printResultado('*', x, y, divisao(x, y));
                    break;
            }
        } while (opcao != 5);
    }
}