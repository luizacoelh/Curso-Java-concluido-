package Vetores;

public class Array {
    public static void main(String[] args) throws Exception{
        //objetivo do array é armazenar uma lista de elementos do mesmo 
        //tipo[] nomeVariavel = new tipo[tamanho];


        String[] nome = new String[5];
        // 0 , 1 , 2 , 3 , 4
        nome[0] = "João";
        nome[1] = "Maria";
        nome[2] = "Goku";
        nome[3] = "Piccolo";
        nome[4] = "Vegeta";

        for(int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++ ){
            System.out.print(nome[posicaoVetor] + " ");
        }
    }
}
