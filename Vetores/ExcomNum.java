package Vetores;

import java.util.Arrays;

public class ExcomNum {
    public static void main(String[] args) throws Exception{
        int[] numeros = new int[100];

        // Preenchendo o vetor com valor (0)
        Arrays.fill(numeros, -1);

        System.out.println(Arrays.toString(numeros));
    }
}

