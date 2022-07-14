/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_06;

import Control.CafeteraControl;
import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class POO_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraControl cc = new CafeteraControl();
        Cafetera cafe1 = cc.llenarCafetera();
        cc.agregarCafe();
        cc.servirTaza();
        cc.vaciarCafetera();
        
    }
    
}
