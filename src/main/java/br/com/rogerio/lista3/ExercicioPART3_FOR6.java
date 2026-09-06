package br.com.rogerio.lista3;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class ExercicioPART3_FOR6 {
    public static void main( String[] args){

        Scanner sc = new Scanner(System.in);

        int numeroInteiro;
        System.out.println("Ler um numero Inteiro");
        numeroInteiro = sc.nextInt();

        if (numeroInteiro == 0){
        System.out.println("o Fatorial de 0 é" + numeroInteiro);
        }else{

            int fatora = 1;
            for (int i = 1; i <= numeroInteiro; i++) {
                fatora *= i; // multiplica acumulador pelo i
            }

            System.out.println("Fatorial de " + numeroInteiro + " = " + fatora);

        }


    }
}
