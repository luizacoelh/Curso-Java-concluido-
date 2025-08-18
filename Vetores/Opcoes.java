package Vetores;

import javax.swing.JOptionPane;

public class Opcoes {
    public static void main(String[] args) {
        String[] opcoes = new String[] {
            "Anime HunterXHunter",
            "Série Game of Thrones",
            "Filme Vingadores",
            "Sair"
        };
        int opcaoEscolhida = 0;
        
        while(opcaoEscolhida != 3) {
            opcaoEscolhida = JOptionPane.showOptionDialog(
                null,
                "O que você gostaria de assistir?",
                "Max",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );
            System.out.println("Opção escolhida" + opcaoEscolhida);
        }
    }
}
