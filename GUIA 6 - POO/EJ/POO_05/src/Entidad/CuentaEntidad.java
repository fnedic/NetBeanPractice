/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Larry
 */
public class CuentaEntidad {
    public String nombre;
    public int numeroCuenta;
    public long DNI;
    public int saldo;
    public int saldoTotal;
    public int saldoPrevio;
    public int retiro;

    public CuentaEntidad(String nombre, int numeroCuenta, long DNI, int saldo, int saldoTotal, int saldoPrevio, int retiro) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.saldoTotal = saldoTotal;
        this.saldoPrevio = saldoPrevio;
        this.retiro = retiro;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public int getSaldoPrevio() {
        return saldoPrevio;
    }

    public void setSaldoPrevio(int saldoPrevio) {
        this.saldoPrevio = saldoPrevio;
    }

    public int getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(int saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public CuentaEntidad() {
    }

    public CuentaEntidad(long DNI) {
        this.DNI = DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
