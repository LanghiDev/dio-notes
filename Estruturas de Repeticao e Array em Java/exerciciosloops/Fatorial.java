package com.langhidev.exerciciosloops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Número para o fatorial: ");
        int num = input.nextInt();

        int fatorial = 1;

        for(int i=num;i>=1;i--){
            fatorial *= i;
        }

        System.out.println(num+"! = "+fatorial);
    }
}
