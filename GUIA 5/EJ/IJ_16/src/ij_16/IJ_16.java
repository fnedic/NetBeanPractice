/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_16;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] Vector = new int [100];
        RVector(Vector);
        for (int i = 0; i < 100; i++) {
            System.out.print("["+Vector [i]+"]");
        }
        System.out.println("");
        System.out.println("");
        BuscarNumero(Vector);
    }
    public static int RVector(int [] Vector){
        for (int i = 0; i < 100; i++) {
            Vector [i] = (int) (Math.random()*100);
        }
        return Vector [0];
    } 
    public static void BuscarNumero(int [] Vector){
        Scanner leer = new Scanner (System.in);
        System.out.print("NUMERO ENTERO MENOR A 100 A IDENTIFICAR ---> ");
        int numero = leer.nextInt();
        System.out.println("");
        while (numero>100){
            System.out.println("ERROR ---> NUMERO INGRESADO INCORRECTO");
            System.out.println("INGRESE UN NUMERO -ENTERO MENOR A 100- A IDENTIFICAR ---> ");
            numero = leer.nextInt();
        }
        System.out.println("");
        System.out.println("NUMERO INGRESADO CORRECTO!");
        System.out.println("BUSCANDO ....");
        System.out.println("...");
        System.out.println("");
        int contador = 0;
        for (int i = 0; i < 100; i++) {
            if (Vector[i]==numero) {
                System.out.println("COINCIDENCIA ! ---> POSICION: "+i);
                contador = contador + 1;
            }
        }
        if (contador>1) {
            System.out.println("");
            System.out.println("COINCIDENCIAS DEL NUMERO "+numero+" ---> "+contador);
        } else System.out.println("NUMERO NO ENCONTRADO");
    }
}
