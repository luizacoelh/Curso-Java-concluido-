import javax.swing.JOptionPane;
public class incremento {

    public static void main(String[] args) throws Exception {
        int contador = 0;
        

        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador = contador +1; 
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador++; //contador= contador + 1
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador --;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador --;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador --;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador +=5;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador *= 10;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador /= 25;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        ++ contador; 
        //++contador 
        // contador = contador + 1
        //imprimir o novo valor do contador 

        // contador++ 
        // imprimir o valor antigo 
        // contador = contador + 1
    }
}
