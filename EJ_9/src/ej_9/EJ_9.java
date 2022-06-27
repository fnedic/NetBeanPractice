/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_9;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class EJ_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase o palabra que comienze con la letra A:");
        String user = leer.nextLine();
        String userLC = user.toLowerCase();
        String control = "a";
        if ((userLC.substring(0,1).equals(control))){
            System.out.println("CORRECTO");
        } else { System.out.println("INCORRECTO");
    }
    }
}
