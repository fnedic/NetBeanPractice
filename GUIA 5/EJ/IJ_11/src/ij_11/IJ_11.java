/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_11;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class IJ_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leer2 = new Scanner (System.in);
        boolean salir = true;
        System.out.println("Ingrese los dos valores enteros con los que desea operar:");
        System.out.print("Valor 1: ");
        double valor1 = leer.nextDouble();
        while (valor1%1!=0 || valor1==0){
            System.out.println("El valor ingresado no es un numero entero.");
            System.out.println("Intente nuevamente.");
            System.out.print("Valor 1: ");
            valor1 = leer.nextDouble();
        }
        System.out.print("Valor 2: ");
        double valor2 = leer.nextDouble();
        while (valor2%1!=0 || valor2==0){
            System.out.println("El valor ingresado no es un numero entero.");
            System.out.println("Intente nuevamente.");
            System.out.print("Valor 2: ");
            valor2 = leer.nextDouble();
        }
        int opcion;
        System.out.println("");
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("");
            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();
        } while (opcion<1 || opcion>5 || opcion%1!=0);
        do {
         switch (opcion) {
            case 1:
                System.out.println("");
                System.out.println(valor1+" + "+valor2+" = "+(valor1+valor2));
                do {
                    System.out.println("");
                    System.out.println("----- MENU -----");
                    System.out.println("1. SUMA");
                    System.out.println("2. RESTA");
                    System.out.println("3. MULTIPLICAR");
                    System.out.println("4. DIVIDIR");
                    System.out.println("5. SALIR");
                    System.out.println("");
                    System.out.print("Elija una opcion: ");
                    opcion = leer.nextInt();
                } while (opcion<1 || opcion>5 || opcion%1!=0);
                break;
            case 2:
                System.out.println("");
                System.out.println(valor1+" - "+valor2+" = "+(valor1-valor2));
                do {
                    System.out.println("");
                    System.out.println("----- MENU -----");
                    System.out.println("1. SUMA");
                    System.out.println("2. RESTA");
                    System.out.println("3. MULTIPLICAR");
                    System.out.println("4. DIVIDIR");
                    System.out.println("5. SALIR");
                    System.out.println("");
                    System.out.print("Elija una opcion: ");
                    opcion = leer.nextInt();
                } while (opcion<1 || opcion>5 || opcion%1!=0);
                break;
            case 3:
                System.out.println("");
                System.out.println(valor1+" * "+valor2+" = "+(valor1*valor2));
                do {
                    System.out.println("");
                    System.out.println("----- MENU -----");
                    System.out.println("1. SUMA");
                    System.out.println("2. RESTA");
                    System.out.println("3. MULTIPLICAR");
                    System.out.println("4. DIVIDIR");
                    System.out.println("5. SALIR");
                    System.out.println("");
                    System.out.print("Elija una opcion: ");
                    opcion = leer.nextInt();
                } while (opcion<1 || opcion>5 || opcion%1!=0);
                break;
            case 4:
                System.out.println("");
                System.out.println(valor1+" / "+valor2+" = "+(valor1/valor2));
                do {
                    System.out.println("");
                    System.out.println("----- MENU -----");
                    System.out.println("1. SUMA");
                    System.out.println("2. RESTA");
                    System.out.println("3. MULTIPLICAR");
                    System.out.println("4. DIVIDIR");
                    System.out.println("5. SALIR");
                    System.out.println("");
                    System.out.print("Elija una opcion: ");
                    opcion = leer.nextInt();
                } while (opcion<1 || opcion>5 || opcion%1!=0);
                break;
            case 5:
                System.out.println("");
                System.out.println("Seguro que desea salir? s/n");
                String salida = leer2.nextLine();
                String salidaLC = salida.toLowerCase();
                while (!"s".equals(salidaLC) & !"n".equals(salidaLC)){
                    System.out.println("");
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    System.out.println("Desea salir del programa? s/n");
                    salida = leer2.nextLine();
                }
                if (salida.equals("s")){
                    salir = false;
                    System.out.println("");
                    System.out.println("Saliendo del programa.......");
                    System.out.println("");
                } else {
                    do {
                        System.out.println("----- MENU -----");
                        System.out.println("1. SUMA");
                        System.out.println("2. RESTA");
                        System.out.println("3. MULTIPLICAR");
                        System.out.println("4. DIVIDIR");
                        System.out.println("5. SALIR");
                        System.out.println("");
                        System.out.print("Elija una opcion: ");
                        opcion = leer.nextInt();
                    } while (opcion<1 || opcion>5 || opcion%1!=0);
                }
            }   
        } while (salir==true);
    }
    
}
