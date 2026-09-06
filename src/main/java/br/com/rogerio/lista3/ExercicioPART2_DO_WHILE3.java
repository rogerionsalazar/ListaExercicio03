package br.com.rogerio.lista3;

import java.util.Scanner;

/// Ler Nota e com Do While
public class ExercicioPART2_DO_WHILE3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     double nota;
        do {
        System.out.println("Informe a Sua nota de 0 a 10 ");
        nota = sc.nextDouble();
        if((nota > 10) || (nota < 0)){
            System.out.println("Nota fora da faixa");
        }
        }while (nota > 10 || nota < 0);

        System.out.println("Nota registrada 5" + nota);
    }
}
