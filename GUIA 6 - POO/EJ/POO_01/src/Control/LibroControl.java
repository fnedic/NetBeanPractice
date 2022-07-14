/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class LibroControl {
    Libro nuevoLibro = new Libro();
    Scanner leerS = new Scanner(System.in);
    Scanner leerN = new Scanner(System.in);
    
    public Libro newLibro (){
        System.out.println("CARGANDO NUEVO LIBRO .....");
        System.out.print("ISBN --> ");
        nuevoLibro.setISBN(leerN.nextInt());
        System.out.print("TITULO: ");
        nuevoLibro.setTitulo(leerS.nextLine());
        System.out.print("AUTOR: ");
        nuevoLibro.setAutor(leerS.nextLine());
        System.out.print("NUMERO DE PAGINAS --> ");
        nuevoLibro.setPaginas(leerN.nextInt());
        System.out.println("");
        
        return nuevoLibro;
    }
    public void readLibro (Libro nuevoLibro){
        Libro leerLibro = new Libro();
        System.out.println("LIBRO: "+nuevoLibro.getTitulo());
        System.out.println("AUTOR: "+nuevoLibro.getAutor());
        System.out.println("ISBN: "+nuevoLibro.getISBN());
        System.out.println("NRO. PAGINAS: "+nuevoLibro.getPaginas());
        System.out.println("");
    }
}
