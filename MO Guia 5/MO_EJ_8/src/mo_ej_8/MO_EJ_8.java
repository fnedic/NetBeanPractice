/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej_8;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class MO_EJ_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int nota;
        do {
            System.out.println("Ingrese una nota entre 0 y 10");
            nota=leer.nextInt();
        } while (nota<0 || nota>10);
    }
}
