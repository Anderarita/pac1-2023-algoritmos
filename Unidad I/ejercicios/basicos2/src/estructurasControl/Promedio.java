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
        
        if (promedio  < 70 ) {
            
            System.out.println("El Estudiante Reprobo: ");
            
        }else if (promedio > 70 && promedio <=80) {
            System.out.println("El Estudiante Aprobo con nota: " + promedio);
            
        }else if (promedio > 80 && promedio <= 90) {
            System.out.println("El estudiante aprobo con nota muy buena: "+ promedio);
            
        }else if (promedio > 90 && promedio <=100) {
            System.out.println("el EStudiante aprobo con nota sobresaliente: "+promedio);
            
        }else
{
            System.out.println("El Estudiante DEjo Algoritmos: ");
        }
        
            
        
    }
}
