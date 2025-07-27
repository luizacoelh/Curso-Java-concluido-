import javax.swing.JOptionPane;
public class precedencias{

    public static void main(String[] args) throws Exception {

        int resultado = 2 *5 + 3 * 4 - 8;
        //10 + 12 - 8
        // 22 - 8
        // 14
        //os parênteses têm a maior precedência, depois a multiplicação e divisão, e por último a adição e subtração.
        JOptionPane.showMessageDialog(null, resultado);
    }
}