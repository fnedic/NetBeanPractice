/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej_6;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class MO_EJ_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int n1=leer.nextInt();
        int n2=leer.nextInt();
        if (n1>25 || n2>25)
            System.out.println("Uno de los numeros ingresados es mayor a 25");
        else
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
    }
    
}
