import java.util.Scanner;
public class AtividadeSala15 {
    public static double soma(double x, double y){
            return x + y;
        }
    public static double subtrair(double x, double y){
        }
    public static double multiplicar(double x, double y){
        }
    public static double dividir( double x, double y){
        }
        if
    public static void printResultado(char operador, double x, double y, double resultado){
            System.out.println(x + " " + operador + y + " = " + resultado);
    public static double potenciacao(double x, int expoente){
                double resultado = x;
                for (int n = 0; n < expoente; n++){
                }
            }
            //Utilizando funções e procedimentos faça:
        /*

        1- Quatros operações básicas da matemática (soma, subtração, divisão, multiplicação)
        2- Metodo para calcular a potência de um número real elevado a um número inteiro, tal como: potenciacao(numero,expoente);
        3- Faça um menu para escolha das 5 operações e a opção de sair;
        4- Crie um procedimento que dado o 'char' da operação, imprima os valores, tal como: printResultado(op,x,y);
        6- Se opção 'sair' escolhido, listar todas as operações realizadas;
         */
        Scanner leia = new Scanner(System.in);
        int opcao = -1;
        String historico = "Historico: \n"; //concatenação
        historico = historico + "novo texto";
        System.out.println(historico);
        do {
            System.out.println("Calculadora: \n Escolha uma das opções abaixo.");
            System.out.println(
                    "1- Soma \n" +
                            "2- Subtração \n" +
                            "3- Multiplicação \n" +
                            "4- Divisão \n" +
                            "5- Potenciação \n" +
                            "0- Sair \n"
            );
            opcao = leia.nextInt();
            double x = 0;
            double y = 0;
            switch (opcao){
                case '1':
                    System.out.println("Soma: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y: ");
                    y = leia.nextDouble();
                    printResultado('+',x,y,soma(x,y));
                    break;
                case 2:
                    System.out.println("Subtração: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y: ");
                    y = leia.nextDouble();
                    printResultado('-',x,y,subtrair(x,y));
                    break;
                case 3:
                    System.out.println("Multiplicação: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y: ");
                    y = leia.nextDouble();
                    printResultado('*',x,y,multiplicar(x,y));
                    break;
                case 4:
                    System.out.println("Divisão: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y: ");
                    y = leia.nextDouble();
                    printResultado('/',x,y,dividir(x,y));
                    break;
                case 5:
                    System.out.println("Potência: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("Digite valor para Y: ");
                    y = leia.nextDouble();
                    printResultado('^',x,y,potenciacao(x,y));
                    break;
                case 0:
                    System.out.println("Você escolheu sair. \n " + "Segue abaixo o resumo das operações realizadas.");
                    break;
                default:
                    System.out.println("Opção não encontrada!");
                    break;
            }
        }while (opcao != 0);

        }
    }
