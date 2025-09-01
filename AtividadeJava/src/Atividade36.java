import java.util.Scanner;
public class Atividade36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para calcular o fatorial:");
        int numero = leia.nextInt();
        int fatorial = numero;
        int count = numero;
        while (count > 1){
            count--;
            fatorial = fatorial * count;
        }
        System.out.println("O fatorial de " + numero + " é:" + fatorial);
    }
}
