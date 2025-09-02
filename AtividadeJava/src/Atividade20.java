import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean temCNH = false;

        System.out.println("Digite a idade:");
        int idade = leia.nextInt();
        if (idade < 18){
            temCNH = false;
        }
        System.out.println("Possui CNH: ('S' ou 'N')");//'0'
        if (leia.nextLine().toLowerCase().charAt(0) == 's'){
            temCNH = true;
        }
        System.out.println();

    }
}
