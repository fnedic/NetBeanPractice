/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_05;

import Control.CuentaControl;
import Entidad.CuentaEntidad;

/**
 *
 * @author Larry
 */
public class POO_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaControl cc = new CuentaControl();
        CuentaEntidad c1 = cc.crearCuenta();
        cc.ingresar(c1);
        cc.retirar(c1);
        cc.extraccionRapida(c1);
        cc.consultarSaldo(c1);
        cc.consultarDatos(c1);
    }
    
}
