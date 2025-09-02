import java.util.Scanner;
public class Atividade40 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numero = {0,0,0,0,0};
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " +(i+1)+"° numero inteiro:");
            numero[i] = leia.nextInt();
            soma+=numero[i];
        }
        double media = soma/numero.length;
        System.out.println("A media entre os numeros digitados é:" + media);
    }
}
