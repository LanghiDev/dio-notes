package com.langhidev.exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada {
    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo");

        mostrarArquivo(nomeArquivo);

        System.out.println("Fim do programa.");
    }

    static void mostrarArquivo(String arquivo){

        try {
            BufferedReader br = lerArquivo(arquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAcharArquivoException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro inesperado... Entre em contato com o suporte!");
        }
    }

    static BufferedReader lerArquivo(String arquivo) throws ImpossivelAcharArquivoException {
        File file = new File(arquivo);

        try {
            return new BufferedReader(new FileReader(file.getName()));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAcharArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAcharArquivoException extends Exception{
    private String nomeArquivo;
    private String diretorio;

    public ImpossivelAcharArquivoException(String nomeArquivo, String diretorio) {
        super("O arquivo nomeado "+nomeArquivo+" não foi encontrado no diretório "+diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAcharArquivoException{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}