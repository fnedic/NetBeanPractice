/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_14;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leer2 = new Scanner (System.in);
        System.out.println("MONTO A CONVERTIR EN € --> ");
        double euro = leer.nextInt();
        System.out.println("");
        System.out.println("INGRESE MONEDA A LA CUAL REALIZAR LA CONVERSION");
        System.out.println("1 - Peso Argentino (ARS)");
        System.out.println("2 - Dolar Norteamericano (USD)");
        System.out.println("3 - Yen");
        System.out.print("--> ");
        String cambio = leer2.nextLine();
        System.out.println("");
        while (!"1".equals(cambio) & !"2".equals(cambio) & !"3".equals(cambio)){
            System.out.println("OPCION INCORRECTA");
            System.out.println("");
            System.out.println("INGRESE MONEDA A LA CUAL REALIZAR LA CONVERSION");
            System.out.println("1 - Peso Argentino (ARS)");
            System.out.println("2 - Dolar Norteamericano (USD)");
            System.out.println("3 - Yen Japones");
            System.out.print("--> ");
            cambio = leer2.nextLine();
        }
        System.out.println("");
        divisas(euro,cambio);
    }
    public static void divisas(double monto, String cambio){
        switch (cambio){
            case "1":
                System.out.println(monto+"€ ----> "+monto*131.88+" ARS");
                System.out.println("");
                break;
            case "2":
                System.out.println(monto+"€ ----> "+monto*1.06+" USD");
                System.out.println("");
                break;
            case "3":
                System.out.println(monto+"€ ----> "+monto*143.25+" Yenes Japoneses");
                System.out.println("");
                break;
        }
    }
}
