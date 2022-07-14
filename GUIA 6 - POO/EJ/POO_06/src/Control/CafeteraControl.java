/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class CafeteraControl {
    Cafetera newCafe = new Cafetera();
    Scanner leer = new Scanner (System.in);
    
    public Cafetera llenarCafetera(){
        
        newCafe.setCapacidadMax(1000);
        System.out.println("LLENANDO CAFETERA ... ...");
        newCafe.setCantidadActual(newCafe.getCapacidadMax());
        System.out.println("");
        
        return newCafe;
    }
    
    public Cafetera servirTaza(){
        
        System.out.print("CANTIDAD DE CAFE DISPONIBLE --> "+newCafe.getCantidadActual()+" ml");
        System.out.print("INGRESE EL TAMAÑO DE SU TAZA (ml) --> ");
        int taza = leer.nextInt();
        System.out.println("");
        if (taza>newCafe.getCantidadActual()) {
            System.out.println("SIRVIENDO CAFE .. ..");
            System.out.print("SE HAN SERVIDO --> "+newCafe.getCantidadActual()+" ml DE CAFE");
            newCafe.setCantidadActual(newCafe.getCantidadActual()-taza);
            System.out.println("");
        } else  {
            System.out.println("SIRVIENDO CAFE .. ..");
            newCafe.setCantidadActual(newCafe.getCantidadActual()-taza);
            System.out.println("DISFRUTE DE SU TAZA LLENA DE CAFE :)");
            System.out.println("");
        }
        
        return newCafe;
    }
    
    public Cafetera vaciarCafetera(){
        
        System.out.println("VACIANDO CAFETERA .. .. .");
        System.out.println(".. ..");
        System.out.println("");
        newCafe.setCantidadActual(0);
        
        return newCafe;
    }
    
    public Cafetera agregarCafe(){
        
        System.out.println("CANTIDAD DE CAFE DISPONIBLE --> "+newCafe.getCantidadActual()+" ml");
        System.out.print("INDIQUE LA CANTIDAD DE CAFE A AÑADIR (ml) -->");
        int añadir = leer.nextInt();
        while ((añadir+newCafe.getCantidadActual())>newCafe.getCapacidadMax()) {
            System.out.println("LA CANTIDAD INGRESADA SUPERARÁ EL LIMITE MAXIMO SOPORTADO POR LA CAFETERA");
            System.out.println("INGRESE UN VALOR INFERIOR A: "+(newCafe.getCapacidadMax()-newCafe.getCantidadActual()));
            añadir = leer.nextInt();
            System.out.println("");
        }
        System.out.println("AGREGANDO CAFE .. ...");
        newCafe.setCantidadActual(newCafe.getCantidadActual()+añadir);
        
        return newCafe;
    }
}
