package br.com.rogerio.lista3;

import java.util.Scanner;

public class ExercicioPART4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int numeroAlunos = sc.nextInt();

        double somaNotas = 0;
        int aprovados = 0, reprovados = 0;

        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            double nota = sc.nextDouble();

            somaNotas += nota;

            if (nota >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = somaNotas / numeroAlunos;

        System.out.printf("Média da turma: %.2f%n", media);
        System.out.println("Alunos Aprovados: " + aprovados);
        System.out.println("Alunos Reprovados: " + reprovados);

    }
}
