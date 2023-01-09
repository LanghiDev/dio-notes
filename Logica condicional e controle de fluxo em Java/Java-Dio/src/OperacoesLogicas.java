public class OperacoesLogicas {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b2 || b3);
        System.out.println(b2 || b4);
        System.out.println(b1 ^ b3);
        System.out.println(b4 ^ b1);
        System.out.println(!b1);
        System.out.println(!b4);

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int qntDepen = 4;
        int mediaDepen = 2;

        System.out.println((salarioMensal < mediaSalario) && (qntDepen >= mediaDepen));

        // Simplificando

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDepen = qntDepen >= mediaDepen;

        System.out.println(salarioBaixo && muitosDepen);

        // Guardando a simplificação na variável

        boolean recebeAuxilio = salarioBaixo && muitosDepen;
        System.out.println("Recebe Auxílio? " + recebeAuxilio);

        System.out.println();

    }
}
