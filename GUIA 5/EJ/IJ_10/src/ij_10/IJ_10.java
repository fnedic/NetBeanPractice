/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_10;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un valor limite positivo:");
        double limite = leer.nextDouble();
        while (limite<=0){
            System.out.println("El valor ingresado no es un valor positivo.");
            System.out.println("Intente de nuevo:");
            limite = leer.nextDouble();
        }
        double suma = 0;
        double user;
        while (suma<=limite) {
            System.out.println("Ingrese valores hasta superar el valor limite:");
            System.out.println("Valor limite: "+limite);
            System.out.println("Valor ingresado "+suma);
            user = leer.nextDouble();
            suma = suma+user;
        }
        System.out.println("El valor total ("+suma+"), ha superado el valor limite ("+limite+").");
    }
    
}
