public class Exemplos {
 public static void main(String[] args) { 
    int idade = 25;
    boolean adulto = idade >= 18 && idade < 60;//intervalo
    System.out.println("É adulto: " + adulto);

    int nota = 85;  
    boolean aprovado = nota >= 60;
    boolean comDistincao = nota >= 90;//multipplas condições 
    System.out.println("Aprovado: " + aprovado);

    boolean podeVotar = idade >= 16;
    boolean obrigatorioVotar = idade >= 18 && idade < 70; //combinação expressoes 
    System.out.println("Pode votar: " + podeVotar);
 }    
}
