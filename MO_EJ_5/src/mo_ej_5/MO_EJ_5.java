/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej_5;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class MO_EJ_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        char letra=leer.next().charAt(0);
        String frase=leer.nextLine();
        boolean verdofalso=leer.nextBoolean();
        System.out.println("El caracter es "+letra);
        System.out.println("La cadena es "+frase);
    }
    
}
