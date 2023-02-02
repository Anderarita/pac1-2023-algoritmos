package suma;

import java.util.Scanner;

public class Trabajo{
    public static void main(String[] args) {
        Scanner Leer = new Scanner( System.in);
        System.out.println("--- EJERCICIO NUMERO 1----");
        System.out.println("Ingrese El Primer Numero: ");
        double num = Leer.nextDouble();
        System.out.println("Ingrese El Segundo Numero: ");
        double nume = Leer.nextDouble();
        
        
        
        double suma = Math.abs(num) + Math.abs(nume);
        System.out.println("la suma es: " + suma);
        
        double resta = Math.abs(num) - Math.abs(nume);
        System.out.println("LA RESTA ES: " + resta);
        
        double multiplicacion = Math.abs(num) * Math.abs(nume);
        System.out.println("LA MULTIPLICACION ES: " + multiplicacion);
        
        double divicion = Math.abs(num) / Math.abs(nume);
        System.out.println("LA DIVICION ES: " + divicion);
       
    }

}


