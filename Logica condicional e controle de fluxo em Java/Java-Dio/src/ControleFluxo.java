public class ControleFluxo {
    public static void main(String[] args) {
        // Exercício 1

        int num = 1;

        if(num == 1) {
            System.out.println("Janeiro");
        } else if (num == 2) {
            System.out.println("Fevereiro");
        } else if (num == 3) {
            System.out.println("Março");
        }

        switch (num){
            case 1:
            case 12:
            case 7:
                System.out.println("Férias");
                break;
        }

        // Exercício 2

        switch (num){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
        }

        int num2 = 2;

        switch (num2){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }

        boolean b2 = true;
        if(!b2)
            System.out.println("Vdd");
        else
            System.out.println("mentira!");

    }
}
