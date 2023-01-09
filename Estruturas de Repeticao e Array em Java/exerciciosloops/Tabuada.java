package com.langhidev.exerciciosloops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("De qual número você gostaria de ver a tabuada?");
        int numTab = input.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(numTab+" X "+i+" = "+numTab*i);
        }

        System.out.println("\nFIM!");
    }
}
