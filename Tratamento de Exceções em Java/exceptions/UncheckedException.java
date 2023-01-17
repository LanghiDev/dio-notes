package com.langhidev.exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do{
            String n1 = JOptionPane.showInputDialog("Numerador: ");
            String n2 = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = Integer.parseInt(n1)/Integer.parseInt(n2);
                System.out.println("Resultado: "+resultado);
                continueLooping = false;
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossível divisão por 0!");
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, informe um número inteiro. " + e.getMessage());
                //e.printStackTrace();
            }finally {
                System.out.println("Finally men");
            }
        }while (continueLooping);

        System.out.println("Fim do programa.");
    }
}
