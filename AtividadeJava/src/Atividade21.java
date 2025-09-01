import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a primeira nota: (0 a 9) ");
        double n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: (0 a 9");
        double n2 = leia.nextDouble();
        if (n1 >= 6 && n2 >= 6) {
            System.out.println("Situação: Aprovado");
        } else if (n1 >= 4 || n2 >= 4) {
            System.out.println("Situação: Recuperação");
        }else {
            System.out.println("Situação: Reprovado");

        }
    }
    }
}
