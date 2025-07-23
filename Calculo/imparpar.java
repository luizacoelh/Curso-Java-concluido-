import javax.swing.JOptionPane;
public class imparpar {
// para descobrir se o número é par ou ímpar
    public static void main(String[] args) throws Exception {
        int numeroA = 83;
        int numeroB = 6;

        int resultado = numeroA % 2;
// resto diferente de zero é ímpar


        JOptionPane.showMessageDialog(null, resultado, "Matemática", JOptionPane.INFORMATION_MESSAGE);
    }
}
