/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_4;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class EX_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("INGRESE UN NUMERO ENTRE 1 y 10 --> ");
        int num = leer.nextInt();
        System.out.println("");
        if (num<1 || num>10) {
            System.out.println("NUMERO INGRESADO INCORRECTO!");
            System.out.print("INGRESE UN NUMERO ENTRE 1 y 10 --> ");
            num = leer.nextInt();
        }
        numRomanos(num);
        String numR = numRomanos(num);
        System.out.println(num+" = "+numR);
        System.out.println("");
    }
    public static String numRomanos(int num){
        String numR = "";
        switch (num){
            case 1: numR="I";
            break;
            case 2: numR="II";
            break;
            case 3: numR="III";
            break;
            case 4: numR="IV";
            break;
            case 5: numR="V";
            break;
            case 6: numR="VI";
            break;
            case 7: numR="VII";
            break;
            case 8: numR="VIII";
            break;
            case 9: numR="IX";
            break;
            case 10: numR="X";
            break;
        }
        return (numR);
    }
}
