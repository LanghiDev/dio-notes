package com.langhidev.exerciciosloops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int par = 0, impar = 0;

        System.out.println("Quantidade de Números: ");
        int qnt = input.nextInt();

        for(int i=1;i<=qnt;i++){
            System.out.println(i+"° Número: ");
            num = input.nextInt();
            if(num % 2 == 0)
                par++;
            else
                impar++;
        }

        System.out.println("Números Pares: "+par);
        System.out.println("Números Impares: "+impar);
    }
}
