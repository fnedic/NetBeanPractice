/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_2;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String user = leer.nextLine();
        System.out.println("Su nombre es: "+user);
    }
    
}
