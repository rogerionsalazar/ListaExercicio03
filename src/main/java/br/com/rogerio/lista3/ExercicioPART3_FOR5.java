package br.com.rogerio.lista3;

import java.util.Scanner;

public class ExercicioPART3_FOR5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A,B;

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();

        if (A >= B){
            System.out.println("Intervalo Invalido");
        }else {
            for (int i = A; i < B; i++){
                int resultado;
                if(i % 2 == 0) {
                    System.out.println("teoria seria o resto " + i);
                }

            }
        }


    }
}
