/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_8;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase o palbra de 8 caracteres:");
        String user = leer.nextLine();
        if (user.length()==8){
            System.out.println("");
            System.out.println("CORRECTO");
        } else {
            System.out.println("");
            System.out.println("INCORRECTO");
        }
    }
    
}
