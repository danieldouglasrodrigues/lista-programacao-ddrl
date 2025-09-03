import java.util.Scanner;
public class Atividade24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in) ;
        System.out.println("Diga um número");
        double num = leia.nextDouble();
        if (num*num>100){
            System.out.println("Quadrado calculado");
        }else {
            System.out.println("Quadrado pequeno ou igual a 100");
        }
    }
}