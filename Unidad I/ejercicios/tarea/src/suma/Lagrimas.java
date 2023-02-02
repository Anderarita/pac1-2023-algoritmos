package suma;

import java.util.Scanner;

public class Lagrimas{
    public static void main(String[] args) {
        Scanner Leer = new Scanner( System.in);
        System.out.println("--- EJERCICIO NUMERO 3----");
        System.out.println("Ingrese El Valor Del Producto: ");
        double valor = Leer.nextDouble();
        System.out.println("Ingrese La Cantidad Del Producto: ");
        double producto = Leer.nextDouble();
        
        double total = Math.abs(valor) * Math.abs(producto);
        System.out.println("El TOTAL A PAGAR ES DE: " +  total);
    }
}
