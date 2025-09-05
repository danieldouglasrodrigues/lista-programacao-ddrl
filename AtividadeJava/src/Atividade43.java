import java.util.Scanner;
public class Atividade43 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[8];
        int maiorNumero = 0, menorNumero = 0;

        for (int indice = 0; indice < 8; indice++){
            System.out.println("Digite o valor:");
            numeros[indice] = leia.nextInt();

            if (numeros[indice] > maiorNumero)
                maiorNumero = numeros[indice];
            else if(numeros[indice] < menorNumero)
                menorNumero = numeros[indice];

        }
        System.out.println("O maior número digitado foi: " + maiorNumero);
        System.out.println("O menor número digitado foi: " + menorNumero);

    }
}