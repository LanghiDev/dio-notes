package com.langhidev.exerciciosmetodos;

public class AreaQuadrilateros {

    public static void calcularArea(double lado){
        double area = lado*lado;
        System.out.println("Área do Quadrado de lados "+lado+" = "+area+" u.a.");
    }
    public static void calcularArea(double l1, double l2){
        double area = l1*l2;
        System.out.println("Área do Retângulo de lado "+l1+" x "+l2+" = "+area+" u.a.");
    }
    public static void calcularArea(double baseMaior, double baseMenor, double altura){
        double area = ((baseMaior+baseMenor)*altura) / 2;
        System.out.println("Área do Trapézio = "+area+" u.a.");
    }

}
