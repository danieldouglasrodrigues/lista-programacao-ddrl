public class Atividade45 {
    public static void main(String[] args) {
        int[] primeiroVetor = {1,2,3,4,5};
        int[] segundoVetor = {5,4,3,2,1};

        int[] vetorSoma = new int[5];

        for (int i = 0; i < vetorSoma.length;i++){
            vetorSoma[i] = primeiroVetor[i] + segundoVetor[i];
            System.out.println("Vetor soma["+i+"]" + " = " + vetorSoma[i]);
        }
    }
}