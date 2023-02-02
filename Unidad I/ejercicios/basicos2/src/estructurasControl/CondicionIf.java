package estructurasControl;

import java.util.Scanner;
/*
*>mayor que
*< menor  que
*>= mayor o igual que
*<= menor igual o que
* == comparacion
*
*Compuertas logicas
* && => AND o Y
* || => OR 
*/
public class CondicionIf{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18) {
            System.out.println("Es Mayor De Edad: ");
        }else{
            System.out.println("Es Menor De Edad: ");
        }
        
        if (edad >= 16 && edad <= 18) {
            System.out.println("Puede Participar Con LA sub 18:");
        }else {
            System.out.println("NO Puede Participar Con La1 SUb 18");
        }
    }
}
