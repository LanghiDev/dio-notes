package com.langhidev.exerciciosmetodos;

public class Calculadora {

    public static void somar(double n1, double n2){
        double resultado = n1+n2;
        System.out.println(n1+" + "+n2+" = "+resultado);
    }
    public static void subtrair(double n1, double n2){
        double resultado = n1-n2;
        System.out.println(n1+" - "+n2+" = "+resultado);
    }
    public static void multiplicar(double n1, double n2){
        double resultado = n1*n2;
        System.out.println(n1+" X "+n2+" = "+resultado);
    }
    public static void dividir(double n1, double n2){
        double resultado = n1/n2;
        System.out.println(n1+" / "+n2+" = "+resultado);
    }

}
