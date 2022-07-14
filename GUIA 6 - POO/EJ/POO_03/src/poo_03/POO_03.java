/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_03;

import Control.OperacionControl;
import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class POO_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        OperacionControl op1 = new OperacionControl();
        int opcion = 0;
        System.out.println("-- CALCULADORA DE ENTEROS --");
        Operacion newOp = op1.crearOperacion();
        do {
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("");
            System.out.println("1 - SUMA");
            System.out.println("2 - RESTA");
            System.out.println("3 - MULTIPLICACION");
            System.out.println("4 - DIVISION");
            System.out.println("5 - SALIR DE CALCULADORA");
            opcion=leer.nextInt();
            System.out.println("");
            while (opcion<1 || opcion>5) {
                System.out.println("OPCION INCORRECTA");
                System.out.println("");
                System.out.println("INGRESE UNA OPCION:");
                System.out.println("");
                System.out.println("1 - SUMA");
                System.out.println("2 - RESTA");
                System.out.println("3 - MULTIPLICACION");
                System.out.println("4 - DIVISION");
                System.out.println("5 - SALIR DE CALCULADORA");
                opcion = leer.nextInt();
                System.out.println("");
            }
            System.out.println("");
            switch (opcion){
                case 1: 
                    op1.sumar(newOp);
                    System.out.println("");
                    break;
                case 2: 
                    op1.restar(newOp);
                    System.out.println("");
                    break;
                case 3: 
                    op1.multiplicar(newOp);
                    System.out.println("");
                    break;
                case 4: 
                    op1.dividir(newOp);
                    System.out.println("");
                    break;
                case 5: 
                    System.out.println("SALIENDO DEL SISTEMA ... .. .");
                    continue;
            } 
        } while (opcion!=5);
    }
}
