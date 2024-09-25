import java.util.Scanner;

public class Atividade_2_Pesquisa_de_Idades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int jorge;
        int n = 1;
        int i = 0;
        System.out.println("Quantas pessoas participarão da pesquisa?");
        jorge = entrada.nextInt();

        int[] ids = new int[jorge];

        while (i < jorge) {
            System.out.println("Digite a idade da pessoa " + n);
            ids[i] = entrada.nextInt();
            i++;
            n++;
        }



    }
}
