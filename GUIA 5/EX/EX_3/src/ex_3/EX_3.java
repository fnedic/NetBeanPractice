/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_3;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class EX_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("INGRESE UNA LETRA --> ");
        String letra = leer.nextLine();
        letra.toLowerCase();
        System.out.println("");
        while (letra.length()>1){
            System.out.println("HA INGRESADO MAS DE UN CARACTER");
            System.out.print("INGRESE UNA LETRA --> ");
            letra = leer.nextLine();
            System.out.println("");
        }
        if ("a".equals(letra)||"e".equals(letra)||"i".equals(letra)||"o".equals(letra)||"u".equals(letra)) {
            System.out.println("USTED INGRESO LA VOCAL: "+letra);
        } else System.out.println("LA LETRA INGRESADA ES UNA CONSONANTE :(");
    }
    
}
