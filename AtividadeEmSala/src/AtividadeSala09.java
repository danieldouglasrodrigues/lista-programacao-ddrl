import java.util.Scanner;
public class AtividadeSala09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = leia.nextInt();
        do {
            numero++;
            System.out.println("Vezes que o do/while rodou: " + numero);
        }while (numero < 10);


    }
}
