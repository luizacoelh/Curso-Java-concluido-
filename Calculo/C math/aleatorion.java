import java.util.Random;

public class aleatorion {

    public static void main(String[] args) throws Exception {
        // Gera um número aleatório entre 0 e 100
        int numeroAleatorio = (int) (Math.random() * 101);
        
        // Exibe o número aleatório
    //System.out.println("Número aleatório gerado: " + numeroAleatorio); (codigo comentado))

        // ou desta outra forma
      //  javax.swing.JOptionPane.showMessageDialog(null, "Número aleatório gerado: " + numeroAleatorio); (CODIGO COMENTADO)

      //OUTRA FORMA DE EXIBIR
       
      Random gerador = new Random();
       int numero  = gerador.nextInt(100) + 1 ;
       System.out.println("Número aleatório gerado: " + numero);
    }
}