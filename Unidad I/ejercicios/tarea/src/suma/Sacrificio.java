package suma;

import java.util.Scanner;

public class Sacrificio{
    public static void main(String[] args) {
        Scanner Leer = new Scanner( System.in);
        System.out.println("--- EJERCICIO NUMERO 2----");
        System.out.println("Ingrese El Primer Numero: ");
        double num = Leer.nextDouble();
        System.out.println("Ingrese El Segundo Numero: ");
        double nume = Leer.nextDouble();
        
        double formula = ((Math.abs(num)+ Math.abs(nume)) * (Math.abs(num) - Math.abs(nume)));
        System.out.println("EL RESULTADO ES DE: " + formula);
    }

}
