/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_01;

import Control.LibroControl;
import Entidad.Libro;

/**
 *
 * @author Larry
 */
public class POO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroControl lc = new LibroControl();
        Libro nuevoLibro = lc.newLibro();
        lc.readLibro(nuevoLibro);
    }
    
}
