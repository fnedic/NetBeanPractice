package intro.java;
//@author Larry

import java.util.Scanner;

public class Clase_Intro_Java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String us;
        System.out.println("Por favor, ingresa tu nombre");
        us=leer.next();
        System.out.println("Hola mundo, soy " + us + " y estoy programando con Java");
    }
    
}
