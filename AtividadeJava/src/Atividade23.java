import java.util.Scanner;
public class Atividade23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga um número para saber se é par ou ímppar");
        double k = leia.nextDouble();
        if (k % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Ímpar");
        }
    }
}