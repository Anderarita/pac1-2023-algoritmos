package tipos;

import java.util.Scanner;

public class Leer{
    public static void main (String [] args){
        // tipo de dato
        // Indicar nombre de la variable
        //(opcional) asigna valor numerico a la variable
        
       Scanner scanner = new Scanner( System.in );
       
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("---------------");
        System.out.println("hola" + nombre);
       
    }
}
