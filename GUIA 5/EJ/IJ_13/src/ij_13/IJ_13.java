/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_13;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de lados del cuadrado ---> ");
        int lado = leer.nextInt();
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < (lado-2); i++) {
            System.out.print("*");
            for (int j = 0; j < lado-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
