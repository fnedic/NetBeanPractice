/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_7;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String clave = "eureka";
        System.out.println("Ingrese la palabra clave:");
        String user = leer.nextLine();
        String userLC = user.toLowerCase();
        if (userLC.equals(clave)){
            System.out.println("CORRECTO");
        } else System.out.println("INCORRECTO");
    }
    
}
