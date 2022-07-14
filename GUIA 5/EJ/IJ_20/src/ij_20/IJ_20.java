/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_20;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        System.out.println("--- CUADRADO MAGICO ---");
        System.out.println("INGRESE LOS VALORES ENTRE 1 y 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+i+"]"+"["+j+"] --> ");
                matriz[i][j] = leer.nextInt();
                while (matriz[i][j]<1 || matriz[i][j]>9){
                    System.out.println("!!! NUMERO INGRESADO FUERA DEL RANGO");
                    System.out.print("["+i+"]"+"["+j+"] --> ");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }
        System.out.println("");
        comprobarM(matriz);
        System.out.println("");
    }
    public static void comprobarM(int[][]matriz){
        int control = 0;
        for (int i = 0; i < 3; i++) {
            control= control + matriz[i][0];
        }
        System.out.println("");
        System.out.println("VALOR MAGICO --> "+control);
        System.out.println("");
        boolean ctrl = true;
        for (int i = 0; i < 3; i++) {
            int suma=0;
            for (int j = 0; j < 3; j++) {
                suma=suma+matriz[i][j];
            }
            if (suma!=control) {
                ctrl=false;
            }
        }
        for (int i = 0; i < 3; i++) {
            int suma=0;
            for (int j = 0; j < 3; j++) {
                suma=suma+matriz[j][i];
            }
            if (suma!=control) {
                ctrl=false;
            }
        }
        int suma=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i-j)==0) {
                    suma=suma+matriz[i][j];
                }
            }
        }
        if (suma!=control) {
            ctrl=false;
        }
        suma=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i+j)==2) {
                    suma=suma+matriz[i][j];
                }
            }
        }
        if (suma!=control) {
            ctrl=false;
        }
        if (ctrl==false) {
            System.out.println("CUADRADO [NO] MAGICO");
        }else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("CUADRADO --MAGICO-- :)");
        }
    }
}
