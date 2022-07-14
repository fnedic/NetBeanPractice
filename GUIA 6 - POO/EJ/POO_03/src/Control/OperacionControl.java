/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class OperacionControl {
    public Operacion crearOperacion(){
        Operacion newOp = new Operacion();
        Scanner leerN = new Scanner(System.in);
        
        System.out.println("NUMEROS ENTEROS A OPERAR: ");
        System.out.print("1° NUMERO --> ");
        newOp.setNumero1(leerN.nextDouble());
        System.out.print("2° NUMERO --> ");
        newOp.setNumero2(leerN.nextDouble());
        System.out.println("");
        
        return newOp;
    }
    
    public void sumar(Operacion newOp){
        System.out.println(newOp.getNumero1()+" + "+newOp.getNumero2()+" = "+(newOp.getNumero1()+newOp.getNumero2()));
    }
    
    public void restar(Operacion newOp){
        System.out.println(newOp.getNumero1()+" - "+newOp.getNumero2()+" = "+(newOp.getNumero1()-newOp.getNumero2()));
    }
    
    public void multiplicar(Operacion newOp){
        if (newOp.getNumero1()==0 || newOp.getNumero2()==0) {
            System.out.println("ERROR --- ");
            System.out.println("UNO DE LOS VALORES ES 0");
            System.out.println("RESULTADO: 0");
        }else {
        System.out.println(newOp.getNumero1()+" * "+newOp.getNumero2()+" = "+(newOp.getNumero1()*newOp.getNumero2()));
        }
    }
    
    public void dividir(Operacion newOp){
        if (newOp.getNumero1()==0 || newOp.getNumero2()==0) {
            System.out.println("ERROR --- ");
            System.out.println("UNO DE LOS VALORES ES 0");
            System.out.println("RESULTADO: 0");
        }else {
        System.out.println(newOp.getNumero1()+" / "+newOp.getNumero2()+" = "+(newOp.getNumero1()/newOp.getNumero2()));
        }
    }
}
