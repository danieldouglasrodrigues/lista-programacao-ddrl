import java.util.Scanner;
public class Atividade54 {
    public static double media(double[]notas){
        double media = 0, soma = 0;
        int nItens = notas.length;
        for (int i = 0; i < notas.length; i++){ soma += notas[i];
            if (i == (notas.length-1)) media = soma/nItens;
        }
        return media;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] notas = {0, 0, 0};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota:");
            notas[i] = leia.nextDouble();
        }
        System.out.println("A média das notas é: " + media(notas));
    }
}