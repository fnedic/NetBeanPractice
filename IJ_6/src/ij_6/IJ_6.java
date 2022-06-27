/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_6;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero:");
        double user = leer.nextDouble();
        while ((user%1)!=0){
            System.out.println("El valor ingresado no corresponde a un numero entero:");
            System.out.println("Por favor ingrese un numero entero:");
            user = leer.nextDouble();
        }
        if ((user%2)==0){
            System.out.println("El numero ingresado es PAR");
        } else System.out.println("El numero ingresado es IMPAR");
    }
    
}
