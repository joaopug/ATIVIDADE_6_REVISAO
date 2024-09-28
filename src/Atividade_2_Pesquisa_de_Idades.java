import java.util.Scanner;

public class Atividade_2_Pesquisa_de_Idades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int jorge;
        int n = 1;
        int i = 0;
        int mai = 0;
        int men = 0;
        System.out.println("Quantas pessoas participarão da pesquisa?");
        jorge = entrada.nextInt();

        int[] ids = new int[jorge];

        while (i < jorge) {
            System.out.println("Digite a idade da pessoa " + n);
            ids[i] = entrada.nextInt();
            if (ids[i] < 0) {
                System.out.println("Idade inválida!");
            } else {
                i++;
                n++;
            }
        }

        int maiorId = ids[0];
        int menorId = ids[0];

        for (i = 0; i < jorge; i++) {
            if (ids[i] > maiorId) {
                maiorId = ids[i];
            }
        }

        for (i = 0; i < jorge; i++) {
            if (ids[i] < menorId) {
                menorId = ids[i];
            }
        }

        for (i = 0; i < jorge; i++) {
            if (ids[i] > 18) {
                mai++;
            } else {
                men++;
            }
        }

        System.out.println("Com " + jorge + " pessoa(s) participando da pesquisa, obtemos o seguinte:\n" +
                           "A maior idade: " + maiorId + " ano(s)\n" +
                           "A menor idade: " + menorId + " ano(s)");
        if (mai > 0) {
            System.out.println("A quantidade de maiores de idade: " + mai + " pessoa(s)");
        }
        if (men > 0) {
            System.out.println("A quantidade de menores de idade: " + men + " pessoa(s)");
        }
    }
}
