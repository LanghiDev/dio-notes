package com.langhidev.exerciciosarray;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numsAleatorios = new int[20];

        for (int i=0; i<20; i++){
            int num = random.nextInt(100);
            numsAleatorios[i] = num;
        }

        for (int n : numsAleatorios) {
            System.out.print(n+" ");
        }

        System.out.println("\nSucessores: ");

        for (int nS : numsAleatorios){
            System.out.print(nS+1+" ");
        }
    }
}
