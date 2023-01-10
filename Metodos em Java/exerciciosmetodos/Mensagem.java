package com.langhidev.exerciciosmetodos;

public class Mensagem {

    public static void obterMensagem(int hora){
        switch (hora){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaMadrugada();
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mensagemBomDia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora Inválida!");
                break;
        }
    }

    private static void mensagemBoaMadrugada(){
        System.out.println("Boa Madrugada!");
    }
    private static void mensagemBomDia(){
        System.out.println("Bom Dia!");
    }
    private static void mensagemBoaTarde(){
        System.out.println("Boa Tarde!");
    }
    private static void mensagemBoaNoite(){
        System.out.println("Boa Noite!");
    }

}
