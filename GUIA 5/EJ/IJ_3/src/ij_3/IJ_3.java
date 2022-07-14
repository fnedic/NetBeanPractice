/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_3;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre completo:");
        String user = leer.nextLine();
        System.out.println("Su frase en mayusculas es: "+user.toUpperCase());
        System.out.println("Su frase en minusculas es: "+user.toLowerCase());
    }
    
}
