package exemplo04_heranca_polimorfismo;
import java.util.Scanner;
public class Exemplo04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Usuario user = new Usuario("Victor",31,"Bilboseiro","2334445555");

        user.falar();
    }
}