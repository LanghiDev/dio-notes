package com.langhidev.exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeArquivo = "assistencia13-03.txt";

        try {
            imprimirArquivo(nomeArquivo);
        } catch (FileNotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Nome do arquivo não encontrado :(");
        }catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro inesperado... Entre em contato com o suporte!");
        }

        System.out.println("Fim do programa.");
    }

    public static void imprimirArquivo(String arquivo) throws IOException {
        File file = new File(arquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
