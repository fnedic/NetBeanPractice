/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class CircunferenciaControl {
    Circunferencia newCalc = new Circunferencia();
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        System.out.print("RADIO DE LA CIRCUNFERENCIA --> ");
        newCalc.setRadio(leer.nextDouble());
        System.out.println("");
        return newCalc;
    }
    
    public void area(Circunferencia newClac){
        System.out.print("AREA DE LA CIRCUNSFERENCIA --> ");
        System.out.println(Math.PI*Math.pow((newCalc.getRadio()),2));
    }
    
    public void perimetro(Circunferencia newCalc){
        System.out.print("PERIMETRO DE LA CIRCUNFERENCIA --> ");
        System.out.println(2*Math.PI*(newCalc.getRadio()));
    }
}
