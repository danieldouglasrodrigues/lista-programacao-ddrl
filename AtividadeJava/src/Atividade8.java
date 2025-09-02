import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1 = 0, n2 = 0, n3 = 0, media = 0;
        System.out.println("Digite a primeira nota: ");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = leia.nextDouble();
        media = (n1 + n2 + n3)/3;
        System.out.println("A média das notas é: " + Math.round(media));

    }
}
