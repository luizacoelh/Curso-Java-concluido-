public class Condicional {
    public static void main(String[] args) {
        int temperatura = 25;
        boolean ensolarado = true;

        if (temperatura > 20 && ensolarado) {
            System.out.println("Bom dia pra sair!");
        }

        String clima = (temperatura > 25) ? "Quente" : "Agradável";
    }
}
