public class App {
    public static void main(String[] args) throws Exception {
       // tipo nome
       byte numeroPequeno = 127;
        short numerosShort = -22;
        int numeroMaior = -2147483648;

       System.out.print(numeroPequeno);
        System.out.println(" (byte = -128 a 127)");

       System.out.print(numerosShort);
       System.out.println(" (short = -32.768 a 32.767)");

       System.out.print(numeroMaior);
       System.out.println(" (int = -2.147.483.648 a 2.147.483.647)");
    }
}
