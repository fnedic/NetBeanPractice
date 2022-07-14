/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_5;

import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class EX_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("INGRESE SU PLAN (A, B o C)");
        String plan = leer.nextLine();
        String planUC = plan.toUpperCase();
        System.out.println("");
        while (!"A".equals(planUC) & !"B".equals(planUC) & !"C".equals(planUC)){
            System.out.println("PLAN INGRESADO INCORRECTO!");
            System.out.println("INGRESE SU PLAN (A, B o C)");
            plan = leer.nextLine();
            planUC = plan.toUpperCase();
            System.out.println("");
        }
        System.out.println("INGRESE EL VALOR DEL TRATAMIENTO (ARS): ");
        Scanner leer2 = new Scanner (System.in);
        double est = leer2.nextInt();
        System.out.println(""); 
        switch (planUC){
            case "A":
                System.out.println("PLA TIPO A --> BENEFICIO: 50% DESCUENTO");
                System.out.println("VALOR FINAL DEL TRATAMIENTO --> $"+est*0.5+" ARS");
                break;
            case "B":
                System.out.println("PLA TIPO B --> BENEFICIO: 35% DESCUENTO");
                System.out.println("VALOR FINAL DEL TRATAMIENTO --> $"+est*0.65+" ARS");
                break;
            case "C":
                System.out.println("PLA TIPO C --> NO POSEE DESCUENTO EN TRATAMIENTO");
                System.out.println("VALOR FINAL DEL ESTUDIO --> $"+est+" ARS");
        }
    }
    
}
