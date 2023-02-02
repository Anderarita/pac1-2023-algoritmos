package suma;

import java.util.Scanner;

public class Tortura{
    public static void main(String[] args) {
        Scanner Leer = new Scanner( System.in);
        System.out.println("--- EJERCICIO NUMERO 1----");
        System.out.println("Ingrese El Primer Numero: ");
        double num = Leer.nextDouble();
        System.out.println("Ingrese El Segundo Numero: ");
        double nume = Leer.nextDouble();
        
        int numero = (int)(Math.random()*20+1);
        System.out.println("el num aleatrotion es: "+numero);
    }
}


