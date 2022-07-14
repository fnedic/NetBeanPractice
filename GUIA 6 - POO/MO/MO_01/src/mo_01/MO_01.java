/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_01;

import Control.PersonaControl;
import Entidad.Persona;

/**
 *
 * @author Larry
 */
public class MO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        PersonaControl pControl = new PersonaControl();
        Persona Facu = pControl.leerPersona();
        System.out.println(Facu.toString());
    }
    
}
