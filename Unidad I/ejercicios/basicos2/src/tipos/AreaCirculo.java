package tipos;

import java.util.Scanner;

public class AreaCirculo{
    public static void main(String[]args){
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Area del Circulo");
         System.out.println("----------------");
         
         System.out.println("Ingrese el Radio del Circulo");
         
         double radio = leer.nextDouble();
         double area = Math.PI * Math.pow(radio, 2);
         
         System.out.println("EL AREA DEL CIRCULO ES: " + area);
    }

}
