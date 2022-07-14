/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class RectanguloControl {
    public Rectangulo cerarRectangulo(){
        Rectangulo newRect = new Rectangulo();
        Scanner leerN = new Scanner(System.in);
        
        System.out.println("-- CREADOR DE RECTANGULOS --");
        System.out.print("ALTURA RECTANGULO --> ");
        newRect.setAltura(leerN.nextDouble());
        System.out.print("BASE DEL RECTANGULO --> ");
        newRect.setBase(leerN.nextDouble());
        System.out.println("");
        
        return newRect;
    }
    
    public void superficie(Rectangulo newRect){
        System.out.println("ANALIZANDO DATOS");
        System.out.println("... .. .");
        System.out.println("SUPERFICIE DEL RECTANGULO: "+newRect.getBase()*newRect.getAltura());
    }
    
    public void perimetro(Rectangulo newRect){
        System.out.println("ANALIZANDO DATOS");
        System.out.println("... .. .");
        System.out.println("PERIMETRO DEL RECTANGULO: "+(newRect.getBase()+newRect.getAltura())*2);
    }
    
    public void dibujarRectangulo(Rectangulo newRect){
        System.out.println("ANALIZANDO DATOS");
        System.out.println("DIBUJANDO RECTANGULO");
        for (int i = 0; i < newRect.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < (newRect.getAltura()-2); i++) {
            System.out.print("*");
            for (int j = 0; j < newRect.getBase()-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int i = 0; i < newRect.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
