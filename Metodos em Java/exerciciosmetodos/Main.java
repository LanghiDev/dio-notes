package com.langhidev.exerciciosmetodos;

public class Main {
    public static void main(String[] args) {
        System.out.println("-=-=-=-=-=-=-=-CALCULADORA-=-=-=-=-=-=-=-");
        Calculadora.somar(1203, 43219);
        Calculadora.subtrair(12390,2135);
        Calculadora.multiplicar(30, 321234);
        Calculadora.dividir(20491, 21);

        System.out.println("\n-=-=-=-=-=-=-=-MENSAGEM-=-=-=-=-=-=-=-");
        Mensagem.obterMensagem(12);

        System.out.println("\n-=-=-=-=-=-=-=-EMPRESTIMO-=-=-=-=-=-=-=-");
        Emprestimo.calcular(2190, 2);

        System.out.println("\n-=-=-=-=-=-=-=-ÁREAS-=-=-=-=-=-=-=-");
        AreaQuadrilateros.calcularArea(550);
        AreaQuadrilateros.calcularArea(550, 570);
        AreaQuadrilateros.calcularArea(6, 4, 3);

        System.out.println(AreaQuadrilaterosRetorno.calcularArea(550));
    }
}
