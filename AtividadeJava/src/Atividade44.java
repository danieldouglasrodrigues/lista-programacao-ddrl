import java.util.Scanner;
public class Atividade44 {
    public static void main(String[] args) {
        double[] notas = new double[5];
        double soma = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite as 5 notas dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i]; // Adiciona a nota à soma total.
        }
        double media = soma / notas.length;
        System.out.println("\nA média da turma é: " + media);
    }
}