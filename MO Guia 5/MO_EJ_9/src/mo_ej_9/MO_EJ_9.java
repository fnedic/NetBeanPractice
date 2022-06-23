/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej_9;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class MO_EJ_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,cont,suma;
        suma=0;
        cont=1;
        System.out.println("Ingrese un numero mayor a 0, solo puede ingresar 20 numeros");
        do {
            System.out.println("Numero "+cont+":");
            num=leer.nextInt();
            if (num>0){
                suma=suma+num;
            }
            cont ++;
    } while (cont<=20 && num!=0);
        if (num==0){
            System.out.println("Se detecto el numero 0");
        }
        System.out.println("La suma de los numeros ingresados es de: "+suma);
    }
}
