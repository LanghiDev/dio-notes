package com.langhidev.exerciciosloops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Forma do curso
        int nota;

        System.out.println("Nota: ");
        nota = input.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = input.nextInt();
        }

        // Forma que realizei
        nota = -1;

        while (nota < 0 || nota > 10){
            System.out.println("Insira uma nota entre 0 e 10: ");
            nota = input.nextInt();
        }

        System.out.println("Nota obtida!");
    }
}
