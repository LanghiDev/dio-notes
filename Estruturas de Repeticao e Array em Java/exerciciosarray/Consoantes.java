package com.langhidev.exerciciosarray;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntCons = 0;

        for(int i=0;i<6;i++){
            System.out.println("Letra: ");
            String letra = input.next();
            if(!(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||
            letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||
            letra.equalsIgnoreCase("u"))) {
                consoantes[i] = letra;
                qntCons++;
            }
        }

        System.out.println("Consoantes detectadas:");
        for (String cons : consoantes) {
            if(cons!=null)
                System.out.print(cons+" ");
        }

        System.out.println("Quantidade de consoantes: "+qntCons);
    }
}
