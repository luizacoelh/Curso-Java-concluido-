import java.util.Random;

import javax.swing.JOptionPane;
public class dado {
    
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        String facesString = JOptionPane.showInputDialog("Quantas faces tem o dado?");
        int faceDado = Integer.parseInt(facesString);
        
        int resultado = 1 + gerador.nextInt(faceDado);;

        // Exibe o resultado do lançamento do dado
        JOptionPane.showMessageDialog(null, "Resultado do lançamento do dado: " + resultado);
    }
}
