package Control;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Larry
 */
public class PersonaControl {
    public Persona leerPersona() {
        Scanner leer = new Scanner(System.in);
        Persona nuevaPersona = new Persona();
        
        System.out.println("NOMBRE:");
        nuevaPersona.setNombre(leer.nextLine());
        System.out.println("SEXO:");
        nuevaPersona.setSexo(leer.nextLine());
        System.out.println("EDAD:");
        nuevaPersona.setEdad(leer.nextInt());
        System.out.println("");
        return nuevaPersona;
    }
}
