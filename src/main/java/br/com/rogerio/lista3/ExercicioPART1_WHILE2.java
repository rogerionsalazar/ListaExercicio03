package br.com.rogerio.lista3;

import java.util.Scanner;

public class ExercicioPART1_WHILE2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabuada While, Digite o numero quer?");
            int multiplicando = sc.nextInt();
        System.out.println("Iniciando a Multiplicação");
            int multiplicador = 1, resultado;

            while (multiplicador <= 10){
                    resultado = multiplicando * multiplicador;
                    System.out.println(multiplicando + " X " + multiplicador + " = " + resultado);
                    multiplicador++;
            }
    }
}
