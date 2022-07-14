/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_6;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class EX_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("INGRESE LA CANTIDAD DE PERSONAS A MEDIR --> ");
        int personas = leer.nextInt();
        double [] vpersonas = new double [personas];
        System.out.println("");
        System.out.println("INGRESE LAS ESTATURAS");
        //RECORDAR INGRESAR NUMEROS DECIMALES CON COMA Y NO CON PUNTO
        for (int i = 0; i < personas; i++) {
            System.out.print("PERSONA "+(i+1)+" --> ");
            vpersonas[i]=leer.nextDouble();
        }
        System.out.println("");
        double suma = 0;
        int iteracion = 0;
        double sumat = 0;
        for (int i = 0; i < personas; i++) {
            sumat=sumat+vpersonas[i];
            if (vpersonas[i]<1.6) {
                suma = suma+vpersonas[i];
                iteracion++;
            }
        }
        System.out.println("PROMEDIO DE ESTATURA DE PERSONAS DE <1.6 mts --> "+suma/iteracion+" mts");
        System.out.println("PROMEDIO DE ESTATURA GENERAL --> "+(+sumat/personas)+" mts");
    }
    
}
