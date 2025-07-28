public class Elogico {
    public static void main(String [] args){
        boolean temIdade = true;
        boolean temCarteira = false;
        boolean podeDirigir = temIdade && temCarteira;
        System.out.println("Pode dirigir: " + podeDirigir);

    }
}
