import java.util.Scanner;
public class Atividade38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número (de 1 a 10) para ver a tabuada: ");
        int num = sc.nextInt();
        if (num >= 1 && num <= 10) {
            System.out.println("--- Tabuada do " + num + " ---");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } else {
            System.out.println("Número fora do intervalo. Por favor, digite um número entre 1 e 10.");
        }
    }
}