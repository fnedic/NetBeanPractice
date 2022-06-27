/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_1;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los valores a sumar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt ();
        System.out.println("El resultado de sumar "+num1+" + "+num2+" es: "+(num1+num2));
    }
    
}
