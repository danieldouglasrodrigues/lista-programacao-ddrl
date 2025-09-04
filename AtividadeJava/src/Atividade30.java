import java.util.Scanner;
public class Atividade30 {
    public static void main(String[] args) {
        //ESTRUTURA ESCOLHA (SWITCH)
        Scanner leia = new Scanner(System.in);
        String opcao = "";
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("" +
                "Opção: A \n" +
                "Opção: B \n" +
                "Opção: C \n" +
                "Opção: D \n");
        opcao = leia.next();
        switch (opcao.toUpperCase()){
            case "A":
                System.out.println("Opção A foi escolhida!");
                break;
            case "B":
                System.out.println("Opção B foi escolhida!");
                break;
            case "C":
                System.out.println("Opção C foi escolhida!");
                break;
            case "D":
                System.out.println("Opção D foi escolhida!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}