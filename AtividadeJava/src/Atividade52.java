import java.util.Scanner;
public class Atividade52 {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = sc.nextDouble();
        double temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println("A temperatura de " + temperaturaCelsius + "°C em Fahrenheit é: " + temperaturaFahrenheit + "°F");
    }
}