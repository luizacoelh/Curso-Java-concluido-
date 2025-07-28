public class Oulogico {
    public static void main(String[] args) {
        boolean temDinheiro = true;
        boolean temCartao = false;
        boolean podeComprar = temDinheiro || temCartao;
        System.out.println("Pode comprar: " + podeComprar);
    }
    
}
