package com.langhidev.exerciciosloops;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = input.next();
            if(nome.equals("0"))
                break;
            System.out.println("Idade: ");
            idade = input.nextInt();
        }

        System.out.println("Fim.");
    }
}
