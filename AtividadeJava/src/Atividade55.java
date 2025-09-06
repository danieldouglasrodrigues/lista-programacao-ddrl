import java.util.Scanner;
public class Atividade55 {
    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("Erro: O fatorial não está definido para números negativos.");
        } else {
            long resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }
    }
}