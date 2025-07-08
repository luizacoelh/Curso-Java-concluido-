public class App {
    public static void main(String[] args) throws Exception {
        // tipo nome
        // variaveis do tipo inteiro
        byte numeroPequeno = 127;
        short numerosShort = -22;
        int numeroMaior = -2147483648;
        long numeroGigante = 9223372036854775807L; // L no final para indicar que é um long

        // variaveis de ponto flutuante
        float peso = 78.7f; 
        double pi = 3.14159265358979323846;

        // variavel do tipo caracter
        char letra = '@'; // entre aspas simples

        // variavel booleano
        boolean estouComFome = true;

        // variavel do tipo String
        String nome = "Luiza"; // entre aspas duplas


        System.out.print(numeroPequeno);
        System.out.println(" (byte = -128 a 127)");

        System.out.print(numerosShort);
        System.out.println(" (short = -32.768 a 32.767)");

        System.out.print(numeroMaior);
        System.out.println(" (int = numerico padrão)");

        System.out.print(numeroGigante);
        System.out.println(" (long = 9.223.372.036.854.775.807 do negativo ao positivo)");

        System.out.print(peso);
        System.out.println(" (float = p/decimais e mais leve)");

        System.out.print(pi);
        System.out.println(" (double = padrão decimais)");

        System.out.print(estouComFome);
        System.out.println(" (boolean = variével lógica ou seja true ou false)");

        System.out.print(nome);
        System.out.println(" (String = cadeia de caracteres, ou seja, texto)");
    }
}
