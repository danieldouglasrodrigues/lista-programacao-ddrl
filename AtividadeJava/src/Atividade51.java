import java.util.Scanner;
public class Atividade51 {
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicita os números ao usuário.
        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = sc.nextInt();
        // Chama a função 'somar' e armazena o resultado.
        int resultado = somar(primeiroNumero, segundoNumero);
        // Exibe o resultado.
        System.out.println("A soma de " + primeiroNumero + " e " + segundoNumero + " é: " + resultado);
    }
}