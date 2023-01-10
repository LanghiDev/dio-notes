package com.langhidev.exerciciosmetodos;

public class AreaQuadrilaterosRetorno {

    public static double calcularArea(double lado){
        return lado*lado;
    }
    public static double calcularArea(double lado1, double lado2){
        return lado1*lado2;
    }
    public static double calcularArea(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura) / 2;
    }

}
