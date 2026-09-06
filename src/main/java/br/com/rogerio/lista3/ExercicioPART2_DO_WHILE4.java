package br.com.rogerio.lista3;

import java.util.Scanner;

public class ExercicioPART2_DO_WHILE4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int controle = 1;
        do {
            System.out.println("================================");
            System.out.println("Pressione 1 para Dobro");
            System.out.println("Pressione 2 para Metade");
            System.out.println("Pressione 3 para Quadrado");
            System.out.println("Pressione 0 para Sair");
            System.out.println("================================\n");
            System.out.println("Digite uma das opções:\n");
            int pressionado = sc.nextInt();
            double resultado,numeroEscolhido;

            System.out.println("Informe o Numero que deseja aplicar as opeções citadas");
            numeroEscolhido = sc.nextDouble();

            switch (pressionado){
                case 0:
                    controle = 0;
                    System.out.println("Volte Sempre");
                    break;
                case 1:
                    resultado = numeroEscolhido * 2;
                    System.out.println("Dobrado " + resultado);
                    break;
                case 2:
                    resultado = numeroEscolhido / 2;
                    System.out.println("Dividio " + resultado);
                    break;
                case 3:
                    resultado = Math.pow(numeroEscolhido, 2);
                    System.out.println("Quadrado " + resultado);
                    break;
                default: System.out.println("Informe o Valor valido de 0 a 3");
            }
            ///System.out.println("Informe o Valor de 0 a 3");
        }while (controle >= 1);


    }

}
