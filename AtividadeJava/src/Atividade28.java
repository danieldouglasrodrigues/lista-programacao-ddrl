import java.util.Scanner;
public class Atividade28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String diaDaSemana = "O dia equivalente é: ";
        System.out.println("Digite o numero do dia da semana: (1-7)");
        int opcao = leia.nextInt();
        switch (opcao){
            case 1:
                diaDaSemana += "Segunda-feira";
                break;
            case 2:
                diaDaSemana += "Terça-feira";
                break;
            case 3:
                diaDaSemana += "Quarta-feira";
                break;
            case 4:
                diaDaSemana += "Quinta-feira";
                break;
            case 5:
                diaDaSemana += "Sexta-feira";
                break;
            case 6:
                diaDaSemana += "Sabado";
                break;
            case 7:
                diaDaSemana += "Domingo";
                break;
            default:
                break;

        }
        System.out.println(diaDaSemana);

    }
}
