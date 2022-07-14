/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2;

/**
 *
 * @author Larry
 */
public class EX_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,d,aux;
        a=4;
        b=6;
        c=2;
        d=3;
        System.out.print("A = "+a+" --> ");
        aux=a;
        System.out.println("A = "+d);
        System.out.print("B = "+b+" --> ");
        a=b;
        System.out.println("B = "+c);
        System.out.print("C = "+c+" --> ");
        b=a;
        System.out.println("C = "+aux);
        System.out.print("D = "+d+" --> ");
        System.out.println("D = "+a);
    }
    
}
