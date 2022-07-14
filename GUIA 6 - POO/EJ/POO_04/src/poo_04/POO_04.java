/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_04;

import Control.RectanguloControl;
import Entidad.Rectangulo;

/**
 *
 * @author Larry
 */
public class POO_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloControl rc = new RectanguloControl();
        Rectangulo newRect = rc.cerarRectangulo();
        rc.perimetro(newRect);
        rc.superficie(newRect);
        rc.dibujarRectangulo(newRect);
    }
    
}
