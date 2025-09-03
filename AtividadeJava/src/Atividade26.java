import java.util.Scanner;
public class Atividade26 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga a nota final");
        double notFin = leia.nextDouble();
        if(notFin>=6){
            System.out.println("Aprovado");
        }
        if (notFin < 6 || notFin >= 4){
            System.out.println("Recuperação");
        }
        if (notFin<4){
            System.out.println("Reprovado");
        }
    }
}