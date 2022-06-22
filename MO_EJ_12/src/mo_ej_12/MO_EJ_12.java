/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej_12;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class MO_EJ_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese a continuacion dos numeros, el primero debe ser multiplo del segundo:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo (num1,num2);
    }
    public static void EsMultiplo (int num1, int num2){
        int resultado = (num2%num1);
        if (resultado !=0){
            System.out.println("El numero "+num2+" NO es multiplo de "+num1+".");
        } else {
            System.out.println("FELICIDADES :)");
            System.out.println("El numero "+num2+" es es multiplo de "+num1+".");
        }
    }
}
