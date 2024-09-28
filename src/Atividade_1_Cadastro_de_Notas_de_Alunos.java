import java.util.Scanner;

public class Atividade_1_Cadastro_de_Notas_de_Alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        int i = 0;
        int n = 1;
        int bruh = 0;

        System.out.println("Digite a quantidade de alunos: ");
        qtd = sc.nextInt();

        Double[] notasA = new Double[qtd];

        while (n <= qtd) {
            System.out.println("Digite a nota do aluno " + n + ":");
            notasA[i] = sc.nextDouble();
            if (notasA[i] < 0 || notasA[i] > 10) {
                System.out.println("Nota inválida");
            } else {
                n++;
                i++;
            }
        }

        n = 0;
        i = 0;

        while (i < qtd) {
            if (notasA[i] >= 6) {
                n++;
            } else {
                bruh++;
            }
            i++;
        }

        if (n > 0) {
            System.out.println("Há " + n + " aluno(s) aprovados");
        }
        if (bruh > 0) {
            System.out.println("Há " + bruh + " aluno(s) reprovados");
        }


    }
}