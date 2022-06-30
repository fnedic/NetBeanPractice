/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_12;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String cadena = "";
        int correctas = 0;
        int incorrectas = 0;
        System.out.println("Ingrese las cadenas en el formato correcto:");
        do {
            cadena = leer.nextLine();
            if ("X".equals(cadena.substring(0,1)) & "O".equals(cadena.substring(cadena.length()-1)) & cadena.length()==5) {
                correctas++;
            } else  incorrectas++;
        } while (!"&&&&&".equals(cadena));
        System.out.println("");
        System.out.println("LECTURAS CORRECTAS");
        System.out.println("------- "+correctas+" -------");
        System.out.println("");
        System.out.println("LECTURAS INCORRECTAS");
        System.out.println("------- "+incorrectas+" -------");
    }
    
}
