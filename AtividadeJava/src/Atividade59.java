import java.util.Scanner;
public class Atividade59 {
    public static void mediaAritmetica(double[] vetor){
        double media = 0, soma = 0;
        int nItens = vetor.length;
        for (int i = 0; i < nItens; i++) {
            soma += vetor[i];
            if (i == (nItens-1))
                media = soma/nItens;
        }
        System.out.println("A média dos valores é: " + Math.round(media));
    }
    public static void main(String[] args) {
        double[] valores = {4.5,6.5,7.8,8.9,1.3};
        mediaAritmetica(valores);
    }
}