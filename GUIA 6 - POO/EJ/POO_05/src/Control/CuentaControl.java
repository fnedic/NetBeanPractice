/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.CuentaEntidad;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class CuentaControl {
    CuentaEntidad newCuenta = new CuentaEntidad();
    Scanner leer = new Scanner(System.in);
    Scanner leerS = new Scanner (System.in);
    Random r = new Random();
    
    public CuentaEntidad crearCuenta(){
        
        System.out.println("-- CUENTA BANCO MENDOZA --");
        System.out.print("NOMBRE Y APELLIDO --> ");
        newCuenta.setNombre(leerS.nextLine());
        System.out.print("NRO. CUENTA --> ");
        newCuenta.setNumeroCuenta(leer.nextInt());
        System.out.print("DNI --> ");
        newCuenta.setDNI(leer.nextLong());
        System.out.print("");
        System.out.println("--- CUENTA CREADA CON EXITO ---");
        System.out.println("");
        return newCuenta;
    }
    
    public CuentaEntidad ingresar(CuentaEntidad newCuenta){
        
        System.out.println("-- ACREDITADOR DE SALDO --");
        newCuenta.setSaldoPrevio(0);
        System.out.println("SALDO ACTUAL --> $"+newCuenta.getSaldoPrevio()+" ARS");
        System.out.print("SALDO A ACREDITAR --> ");
        newCuenta.setSaldo(leer.nextInt());
        System.out.println("ACREDITANDO ... ...");
        System.out.println("... .. .");
        System.out.println("SALDO ACREDITADO!");
        newCuenta.setSaldoTotal(newCuenta.getSaldoPrevio()+newCuenta.getSaldo());
        System.out.print("SALDO TOTAL --> $"+newCuenta.getSaldoTotal()+" ARS");
        System.out.println("");
        
        return newCuenta;
    }
    
    public CuentaEntidad retirar(CuentaEntidad newCuenta){
        
        System.out.println("SALDO TOTAL DISPONIBLE EN CUENTA NRO. "+newCuenta.getNumeroCuenta()+" --> $"+newCuenta.getSaldoTotal()+" ARS");
        System.out.print("INGRESE EL MONTO A RETIRAR ($ARS) --> ");
        newCuenta.setRetiro(leer.nextInt());
        System.out.print("CONFIRMA SALDO A RETIRAR? --> "+newCuenta.getRetiro()+" (s/n)");
        Scanner snRetiro = new Scanner (System.in);
        String siNo = snRetiro.nextLine();
        String LC = siNo.toLowerCase();
        while (!"s".equals(LC) & !"n".equals(LC)){
            System.out.println("ERROR!");
            System.out.println("CONFIRME EL VALOR A RETIRAR");
            System.out.println("$ "+newCuenta.getRetiro()+" ARS");
            snRetiro.nextLine();
            LC = siNo.toLowerCase();
        }
        System.out.println("RETIRANDO SALDO .. ...");
        if (newCuenta.getRetiro()>=newCuenta.getSaldoTotal()) {
            newCuenta.setSaldoTotal(0);
            System.out.println("SALDO ACTUAL --> $"+newCuenta.getSaldoTotal()+" ARS");
        } else  {
            newCuenta.setSaldoTotal(newCuenta.getSaldoTotal()-newCuenta.getRetiro());
            System.out.println("SALDO ACTUAL --> $"+newCuenta.getSaldoTotal()+" ARS");
        }
        System.out.println("");
        
        return newCuenta;
    }
    
    public CuentaEntidad extraccionRapida(CuentaEntidad newCuenta){
        
        System.out.println("-- EXTRACCION RAPIDA --");
        System.out.println("SALDO TOTAL DISPONIBLE EN CUENTA NRO. "+newCuenta.getNumeroCuenta()+" --> $"+newCuenta.getSaldoTotal()+" ARS");
        System.out.println("MAXIMO DISPONIBLE A RETIRAR --> "+newCuenta.getSaldoTotal()*0.2);
        System.out.print("INGRESE EL MONTO A RETIRAR ($ARS) --> ");
        int extRapida = leer.nextInt();
        while (extRapida>newCuenta.getSaldoTotal() || extRapida<1){
            System.out.println("-- MONTO INGRESADO INVALIDO --");
            System.out.println("MAXIMO DISPONIBLE A RETIRAR --> "+newCuenta.getSaldoTotal()*0.2);
            System.out.print("INGRESE EL MONTO A RETIRAR ($ARS) --> ");
            extRapida = leer.nextInt();
        }
        System.out.println("PROCESANDO ... ..");
        System.out.println("RETIRANDO --> $"+extRapida+" ARS");
        newCuenta.setSaldoTotal(newCuenta.getSaldoTotal()-extRapida);
        System.out.println("");
        
        return newCuenta;
    }
    
    public void consultarSaldo(CuentaEntidad newCuenta){
        
        System.out.println("SALDO TOTAL DISPONIBLE EN CUENTA --> $"+newCuenta.getSaldoTotal()+" ARS");
        System.out.println("");
        
    }
    
    public void consultarDatos(CuentaEntidad newCuenta){
        
        System.out.println("NRO DE CUENTA: "+newCuenta.getNumeroCuenta());
        System.out.println("NOMBRE Y APELLIDO TITULAR: "+newCuenta.getNombre());
        System.out.println("DNI TITULAR: "+newCuenta.getDNI());
        System.out.println("SALDO TOTAL DISPONIBLE EN CUENTA --> $"+newCuenta.getSaldoTotal()+" ARS");
        
    }
}
