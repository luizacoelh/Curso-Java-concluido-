import javax.swing.JOptionPane;

public class divisão {

    public static void main(String[] args) throws Exception {
        int numeroA = 5;
        int numeroB = 6;

        double resultado = 5 / 2.0; //.0 Isso é importante para que o resultado seja um número decimal. Ou pôr -> double resultado = (double) 5 / 2;

        JOptionPane.showMessageDialog(null, resultado, "Matemática", JOptionPane.INFORMATION_MESSAGE);
    }
}
