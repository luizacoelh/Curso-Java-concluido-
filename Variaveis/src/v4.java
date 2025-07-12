import java.util.Scanner;

import javax.swing.JOptionPane;

public class v4 {
    public static void main(String[] args) throws Exception{
        String filme = JOptionPane.showInputDialog(null, "Qual seu filme preferido de 2025 até o momento?", "Engenharia",JOptionPane.QUESTION_MESSAGE); 
        String texto = JOptionPane.showInputDialog(null, "Digite um número: ");
        int numero = Integer.parseInt(texto);
        numero = numero * 10;
        JOptionPane.showMessageDialog(null, "Filme preferido: " + filme, "Engenharia", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(filme);
        System.out.println(numero);
        
    }
    
} 