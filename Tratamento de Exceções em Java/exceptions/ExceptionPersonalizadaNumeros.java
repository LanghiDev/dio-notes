package com.langhidev.exceptions;

import javax.swing.*;

public class ExceptionPersonalizadaNumeros {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i=0; i < denominador.length; i++){
            try {
                if(numerador[i] % denominador[i] != 0)
                    throw new DivisaoNaoExataException("Divisão não exata por inteiros", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }catch (ArithmeticException ae){
                System.out.println("Impossível Divisão por 0!");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Não há mais números para a operação.");
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Fim do programa.");
    }
}

