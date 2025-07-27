import javax.swing.JOptionPane;

public class math {

    public static void main(String[] args) throws Exception {
        int numeroA = -5;
        int numeroB = 6;

        int resultado1 = Math.abs(numeroA);
        //numero absoluto 

        JOptionPane.showMessageDialog(null, resultado1);

        int resultado2 = (int) Math.pow(10, 2); //10^2

        JOptionPane.showMessageDialog(null, resultado2);

         int resultado3 = (int) Math.sqrt(10); //raiz quadrada 

        JOptionPane.showMessageDialog(null, resultado3);


         double resultado4 =  Math.ceil(10.54); //arredondar para cima

        JOptionPane.showMessageDialog(null, resultado4);

        double resultado5 =  Math.floor(10.54); //arredondar para baixo

        JOptionPane.showMessageDialog(null, resultado5);

        double resultado6 =  Math.min(37 , 44); //retorna o menor valor

        JOptionPane.showMessageDialog(null, resultado6);

        double resultado7 =  Math.max(37 , 44); //retorna o maior valor

        JOptionPane.showMessageDialog(null, resultado7);
    }
    }

