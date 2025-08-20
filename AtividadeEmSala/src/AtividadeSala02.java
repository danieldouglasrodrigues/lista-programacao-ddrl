public class AtividadeSala02 {

    public static void main(String[] argus){
        String nome = "Daniel";
        String sobrenome = "Douglas";
        int idade = 29;
        int anoNasc = 2025-idade;
        double peso = 87.9;
        double altura = 1.79;
        double imc = 0;

        System.out.println("Nome:" + nome + " " + sobrenome);
        String txtPesoaltura = "Peso:" + peso + "; Altura:" + altura;
        System.out.println(txtPesoaltura);
        System.out.println("Ano de Nascimento:" + anoNasc);
        imc = peso/(altura*altura);
        System.out.println("Base de Calculo IMC:" + imc);
    }
}
