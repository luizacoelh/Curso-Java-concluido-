import javax.swing.JOptionPane;
public class módulo {

    public static void main(String[] args) throws Exception {
        int numeroA = 80;
        int numeroB = 6;

        int resultado = numeroA % 2;

        JOptionPane.showMessageDialog(null, resultado, "Matemática", JOptionPane.INFORMATION_MESSAGE);
    }
}
