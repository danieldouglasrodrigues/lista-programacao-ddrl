import java.util.Scanner;
public class Atividade49 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double [][] notas = new double[3][2];
        String[] alunos = new String[3];
        for (int linha = 0; linha < notas.length; linha++){
            System.out.println("Digite o nemo do aluno:");
            alunos[linha] = leia.next();
            System.out.println("Digite as notas de prova do aluno:" + alunos[linha]);
            for (int coluna = 0; coluna < notas[linha].length; coluna++){
                System.out.println("Digite a nota da " + (coluna+1) + "° Prova");
                notas[linha][coluna] = leia.nextDouble();

            }
        }
    }
}
