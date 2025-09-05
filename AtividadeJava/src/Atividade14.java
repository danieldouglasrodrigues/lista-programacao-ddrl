import java.util.Scanner;
public class Atividade14 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um valor para 'A' e uma valor para 'B':");
        int a = leia.nextInt();
        int b = leia.nextInt();
        System.out.println("Soma: " + a + "+" + b + "= "+(a+b));
        System.out.println("Subtração: " + a + "-" + b + "= "+(a-b));
        System.out.println("Multiplicação: " + a + "*" + b + "= "+(a*b));
        System.out.println("Divisão: " + a + "/" + b + "= "+(a/b));
        System.out.println("Módulo: " + a + "%" + b + "= "+(a%b));
    }

}