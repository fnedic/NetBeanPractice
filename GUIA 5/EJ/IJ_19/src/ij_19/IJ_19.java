/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_19;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [][] matrizAS = new int [3][3];
        System.out.println("--- MATRICES ANTISIMETRICAS ---");
        System.out.print("INGRESE LA DIMENSION DE SU MATRIZ --> ");
        int f = leer.nextInt();
        int c = f;
        System.out.println("");
        System.out.println("INGRESE S MATRIZ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("["+i+"]"+"["+i+"] --> ");
                matrizAS[i][j] = leer.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizAS[i][j]>=0) {
                    System.out.print(" ");
                }
                System.out.print(matrizAS[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
        Comprobar(matrizAS,f,c);
    }
    public static void Comprobar(int [][] matriz, int f, int c){
        int contador = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j]==matriz[j][i]*-1) {
                    contador=contador+1;
                }
            }
        }
        if (contador==(f*c)){
            System.out.println("LA MATRIZ INGRESADA ES [ANTISIMETRICA]");
        }else System.out.println("LA MATRIZ INGRESADA [NO] ES ANTISIMETRICA");
    }
}
