package estructurasControl;

import java.util.Scanner;

public class Promedio{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Imgrese la Primera nota: ");
        int nota = leer.nextInt();
        System.out.println("Ingrese La Segunda Nota: ");
        int notaa = leer.nextInt();
        System.out.println("Ingrse La Segunda Nota: ");
        int notas = leer.nextInt();
        
        double promedio = (Math.abs(nota)+ Math.abs(notaa)+ Math.abs(notas)) / Math.abs(3);
        System.out.println("el Promedio Es De: "+ promedio);
        
        if (promedio >= 70) {
            
            System.out.println("El Estudiante Paso: ");
            
        }else{
            System.out.println("El Estudiante DEjo Algoritmos: ");
        }
        
            
        
    }
}
