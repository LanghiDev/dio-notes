package com.langhidev.exerciciosarray;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] M = new int[4][4];

        for(int l=0;l<4;l++){
            for (int c=0;c<4;c++){
                M[l][c] = rand.nextInt(9);
            }
        }

        for (int[] l : M) {
            for (int c : l) {
                System.out.print(c+" ");
            }
            System.out.println();
        }

        int[][] numeros = {{4, 9}, {3, 5}, {2, 5, 6, 1}};
        System.out.println(numeros[2][2]);
    }
}
