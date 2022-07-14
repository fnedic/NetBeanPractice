/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_5;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entrero a continuacion:");
        double user = leer.nextDouble();
        while ((user%1)!=0) {
            System.out.println("El numero ingresado no es un numero entero.");
            System.out.println("Por favor ingrese un numero entero:");
            user = leer.nextDouble();
        }
        System.out.println("El doble del numero "+user+" es: "+(user*2));
        System.out.println("El triple del numero "+user+" es: "+(user*3));
        System.out.println("La raiz cuadrada del numero "+user+" es: "+Math.sqrt(user));
    }
    
}
