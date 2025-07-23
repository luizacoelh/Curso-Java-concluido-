import javax.swing.JOptionPane;

public class soma {
    public static void main(String[] args) throws Exception {
        int numeroA = 5;
        int numeroB = 6;
        int resultado = numeroA + numeroB; // poderia por numeros direito ex -> int resultado = 5 + 6;

        JOptionPane.showMessageDialog(null, resultado, "Matemática", JOptionPane.INFORMATION_MESSAGE);
    }
}