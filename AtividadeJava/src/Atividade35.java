import java.util.Scanner;
public class Atividade35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor = 0, maiorValor = 0;
        while (valor != -1){
            System.out.println("Digite o valor:");
            valor = leia.nextInt();
            if(valor > maiorValor) maiorValor = valor;
        }
        System.out.println("O maior valor digitado é:" + maiorValor);
    }
}
