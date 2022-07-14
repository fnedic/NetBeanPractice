/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_8;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class EX_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("INGRESE NUMEROS MULTIPLOS DE 5");
        int numero;
        int multiplo5;
        int numTotales=0;
        int numP=0;
        int numI=0;
        int sumaP=0;
        int sumaI=0;
        do {
            System.out.print("--> ");
            numero=leer.nextInt();
            multiplo5 = numero%5;
            numTotales++;
            if (numero%2==0) {
                numP++;
                sumaP=sumaP+numero;
            } else {
                numI++;
                sumaI=sumaI+numero;
            }
        } while (multiplo5!=0);
        
        System.out.println("NUMEROS [TOTALES]: "+numTotales);
        System.out.println("NUMEROS [PARES]: "+numP);
        System.out.println("PROMEDIO [PARES]: "+sumaP/numP);
        System.out.println("NUMERO [IMPARES]: "+numI);
        System.out.println("PROMEDIO [IMAPRES]: "+sumaI/numI);
    }
    
}
