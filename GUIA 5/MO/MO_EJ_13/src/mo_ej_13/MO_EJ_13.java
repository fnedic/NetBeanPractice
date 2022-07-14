/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej_13;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class MO_EJ_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa a continuacion la cantidad de integrantes de tu equipo:");
        int cantidadC = leer.nextInt();
        String [] equipo = new String[cantidadC];
        for (int i = 0; i<cantidadC; i++) {
            System.out.println("Ingresa el nombre de el integrante numero "+(i+1));
            equipo[i] = leer.next();
        }
        System.out.println("");
        System.out.println("Tu grupo esta formado por "+cantidadC+" integrantes");
        for (int i = 0; i < cantidadC; i++) {
            System.out.println(equipo[i]);
        }
    }
    
}
