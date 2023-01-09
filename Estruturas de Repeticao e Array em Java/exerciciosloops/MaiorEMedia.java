package com.langhidev.exerciciosloops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int soma = 0;
        int maior = -99999;

        for (int i = 1; i <= 5; i++){
            System.out.println(i+"° Número: ");
            num = input.nextInt();
            soma += num;
            if(num > maior){
                maior = num;
            }
        }

        float media = soma / 5;

        System.out.println("O Maior número foi "+maior);
        System.out.println("A Média dos números é "+media);
    }
}
