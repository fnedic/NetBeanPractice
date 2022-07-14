/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_4;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la temperatura en grados Celsius:");
        double Celsius = leer.nextDouble();
        // Tener en cuenta que si el usuario ingresa un valor con decimales
        // con PUNTO en vez de con COMA, el programa arrojara un ERROR
        double Faren = 32+(9*Celsius/5);
        System.out.println("La temperatura en grados Farenheit es de "+Faren+"°F");
    }
    
}
