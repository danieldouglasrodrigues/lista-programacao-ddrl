import java.util.Scanner;
public class Atividade31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor = 0, soma = 0;
        do {
            System.out.println("Digite o valor:");
            valor = leia.nextInt();
        }while (valor != 0);
        System.out.println("O resultado da soma dos valores é: " + soma);
    }
}
