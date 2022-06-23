/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej_10;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class MO_EJ_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        for (int i = 0; i<=3; i++) {
            System.out.println("Ingrese un numero entre 1 y 20");
            num=leer.nextInt();
            while (num<1 || num>20){
                System.out.println("Debe ingresar un numero entre 1 y 20");
                System.out.println("Intente nuevamente:");
                num=leer.nextInt();
            }
            System.out.print(num+" ");
            for (int j = 0; j <= (num-1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
