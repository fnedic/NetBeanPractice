/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_1;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class EX_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("INGRESE LA CANTIDAD DE MINUTOS ---> ");
        double min = leer.nextInt();
        double dias = (min/60)/24;
        System.out.println("");
        System.out.println(min+" MINUTOS --> "+(dias-(dias%1))+" DIA/S, "+((dias%1)*24)+" HORA/S");
    }
    
}
