import java.util.Scanner;
public class AtividadeSala15 {
    public static double soma(double x, double y){
            return x + y;
        }
        public static void printResultado(char operador, double x, double y, double resultado){
            System.out.println(x + " " + operador + y + " = " + resultado);
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
        do {
            System.out.println("Calculadora: \n Escolha uma das opções abaixo.");
            System.out.println(
                    "1- Soma \n" +
                            "2- Subtração \n" +
                            "3- Multiplicação \n" +
                            "4- Divisão \n" +
                            "5- Potenciação \n"
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
            }
        }

        }
    }
