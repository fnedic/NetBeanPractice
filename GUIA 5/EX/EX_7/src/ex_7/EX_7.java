/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_7;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class EX_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("CANTIDAD DE NUMEROS A INGRESAR --> ");
        int n = leer.nextInt();
        System.out.println("");
        while (n<=0){
            System.out.println("-- VALOR INCORRECTO --");
            System.out.print("CANTIDAD DE NUMERO A INGRESAR --> ");
            n = leer.nextInt();
            System.out.println("");
        }
        int [] vector = new int [n];
        int max = 0;
        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("NUMERO "+(i+1));
            vector[i]=leer.nextInt();
            if (vector[i]<=0){
                System.out.println("--- EL VALOR DEBE SER MAYOR A 0 ---");
                System.out.println("NUMERO "+(i+1));
                vector[i]=leer.nextInt();
            }
            total=total+vector[i];
        }
        int min = vector[0];
        for (int i = 0; i < n; i++) {
            if (vector[i]>max) {
                max=vector[i];
            }
            if (vector[i]<min){
                min=vector[i];
            }
        }
        System.out.println("");
        System.out.println("MAXIMO --> "+max);
        System.out.println("MINIMO --> "+min);
        System.out.println("PROMEDIO --> "+(total/n));
    }
    
}