import java.util.Scanner;
public class Atividade09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double base = 0, altura = 0;
        double perimetro = 0;
        System.out.println("Digite base e altura para saber seu perímetro");
        base = leia.nextDouble();
        altura = leia.nextDouble();
        perimetro = 2 * (base + altura);
        System.out.println("O perímetro é igual a: " + perimetro);
    }
}