package com.langhidev.exerciciosmetodos;

public class Emprestimo {

    private static double getTaxaDuasParcelas(){
        return 0.25;
    }
    private static double getTaxaTresParcelas(){
        return 0.4;
    }

    public static void calcular(double valor, int parcelas){
        double resultado = 0;
        if(parcelas == 2){
            resultado = valor + (valor*getTaxaDuasParcelas());
            System.out.println("R$ "+valor+" parcelado em "+parcelas+"x = "+resultado);
        }else if (parcelas == 3) {
            resultado = valor + (valor * getTaxaTresParcelas());
            System.out.println("R$ " + valor + " parcelado em " + parcelas + "x = " + resultado);
        }else {
            System.out.println("Parcela Indisponível!");
        }
    }

}
