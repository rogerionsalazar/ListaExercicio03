package br.com.rogerio.lista3;

import java.util.Scanner;

public class ExercicioPART1_WHILE1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===========Software Ler Numero qualquer e imprimir até o valor");

        System.out.println("Digite o Valor que deseja alcaçar? \n");
        int numeroInteiro = sc.nextInt();

        if (numeroInteiro < 1){
            System.out.println("O Valor inserido não é possivel alcançalo.");
        }else {
            int controleWhile = 1;
            while (controleWhile <= numeroInteiro) {
                System.out.println(controleWhile + "\n");
                controleWhile++;
            }
        }

    }
}
