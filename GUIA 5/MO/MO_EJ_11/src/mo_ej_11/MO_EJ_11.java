/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej_11;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class MO_EJ_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        FFrase(frase);
        String VFrase = FFrase(frase);
        System.out.println(VFrase);
    }
    public static String FFrase(String frase){
        String cfrase="";
        for (int i = 0; i<frase.length(); i++) {
            switch (frase.substring(i,i+1)){
                case "a":
                    cfrase=cfrase+"@";
                    break;
                case "e":
                    cfrase=cfrase+"#";
                    break;
                case "i":
                    cfrase=cfrase+"$";
                    break;
                case "o":
                    cfrase=cfrase+"%";
                    break;
                case "u":
                    cfrase=cfrase+"*";
                    break;
                default:
                    cfrase=cfrase+frase.substring(i,i+1);
            }             
        }
        return cfrase;
    }
}
