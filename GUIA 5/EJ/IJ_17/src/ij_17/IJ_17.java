/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_17;

/**
 *
 * @author Larry
 */
public class IJ_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int [9999999];
        RVector(vector);
        Contabilizar(vector);
    }
    public static int RVector(int [] vector){
        for (int i = 0; i < 9999999; i++) {
            vector[i] = (int) (Math.random()*99999);
        }
        return vector [0];
    }
    public static void Contabilizar (int [] vector){
        int cifra1 = 0;
        int cifra2 = 0;
        int cifra3 = 0;
        int cifra4 = 0;
        int cifra5 = 0;
        for (int i = 0; i < 9999999; i++) {
            if (vector [i]<10) {
                cifra1=cifra1+1;
            } else if (vector[i]>=10 & vector[i]<100){
                cifra2=cifra2+1;
            }else if (vector[i]>=100 & vector[i]<1000){
                cifra3=cifra3+1;
            }else if (vector[i]>=1000 & vector[i]<10000){
                cifra4=cifra4+1;
            }else if (vector[i]>=10000 & vector[i]<=99999){
                cifra5=cifra5+1;
            }
        }
        System.out.println("NUMEROS DE 1 CIFRA ---> "+cifra1);
        System.out.println("NUMEROS DE 2 CIFRAS ---> "+cifra2);
        System.out.println("NUMEROS DE 3 CIFRAS ---> "+cifra3);
        System.out.println("NUMEROS DE 4 CIFRAS ---> "+cifra4);
        System.out.println("NUMEROS DE 5 CIFRAS ---> "+cifra5);
    }
}