package suma;

import java.util.Scanner;

public class Sudor{
    public static void main(String[] args) {
       
        
        double uno = Math.abs(3.0) / Math.abs(2.0); 
        double total = Math.abs(4.0) / Math.abs(3.0);
        double to = Math.abs(uno) + Math.abs(total);
        System.out.println("El Primer Resultado Es: " + to);
        Scanner Leer = new Scanner( System.in);
        System.out.println("--- EJERCICIO NUMERO 4----");
        System.out.println("Ingrese La variable A: ");
        double A = Leer.nextDouble();
        System.out.println("Ingrese la variable B: ");
        double B = Leer.nextDouble();
        System.out.println("Ingrese La variable C: ");
        double C = Leer.nextDouble();
        System.out.println("Ingrese la variable D: ");
        double D = Leer.nextDouble();
        System.out.println("Ingrese La variable E: ");
        double E = Leer.nextDouble();
        System.out.println("Ingrese la variable F: ");
        double F = Leer.nextDouble();
        System.out.println("Ingrese la variable G: ");
        double G = Leer.nextDouble();
        System.out.println("Ingrese La variable H: ");
        double H = Leer.nextDouble();
        System.out.println("Ingrese la variable I: ");
        double I = Leer.nextDouble();
        
        double dos = Math.abs(A)* Math.abs(A) / (Math.abs(B) - Math.abs(C)) + (Math.abs(D) - Math.abs(E)) / (Math.abs(F) -(( Math.abs(G) * Math.abs(H))/Math.abs(I)));
        System.out.println("el segundo resultado es: "+ dos);
       
        System.out.println("Ingrese La variable A: ");
        double Aa = Leer.nextDouble();
        System.out.println("Ingrese la variable B: ");
        double Ba = Leer.nextDouble();
        System.out.println("Ingrese La variable C: ");
        double Ca = Leer.nextDouble();
        System.out.println("Ingrese la variable D: ");
        double Da = Leer.nextDouble();
        System.out.println("Ingrese La variable E: ");
        double Ea = Leer.nextDouble();
        System.out.println("Ingrese la variable F: ");
        double Fa = Leer.nextDouble();
        
        double tres = (Math.abs(Aa)+(Math.abs(Ba)/Math.abs(Ca))) / (Math.abs(Da)- (Math.abs(Ea)/Math.abs(Fa)));
        System.out.println("El Tercer Resultado Es: " + tres);
        
        System.out.println("Ingrese La variable A: ");
        double Ab = Leer.nextDouble();
        System.out.println("Ingrese la variable B: ");
        double Bb = Leer.nextDouble();
        
        double cuarto =( Math.abs(1) / (Math.abs(Ab) - Math.abs(5))) - ((Math.abs(3)*Math.abs(Ab)*Math.abs(Bb))/ Math.abs(4));
        System.out.println("El Cuarto Resultado Es: " + cuarto);
        
        System.out.println("Ingrese La variable A: ");
        double Ac = Leer.nextDouble();
        System.out.println("Ingrese la variable B: ");
        double Bc = Leer.nextDouble();
        System.out.println("Ingrese La variable C: ");
        double Cc = Leer.nextDouble();
        
        double quinto = (Math.abs(Ac) / Math.abs(Bc)) + Math.abs(Cc);
        System.out.println("El Quinto Resultado Es: " + quinto);
        
        /*System.out.println("Ingrese La variable A: ");
        double Ad = Leer.nextDouble();
        System.out.println("Ingrese la variable B: ");
        double Bd = Leer.nextDouble();
        System.out.println("Ingrese La variable C: ");
        double Cd = Leer.nextDouble();
        System.out.println("Ingrese la variable D: ");
        double Dd = Leer.nextDouble();
        System.out.println("Ingrese La variable E: ");
        double Ed = Leer.nextDouble();
        System.out.println("Ingrese la variable F: ");
        double Fd = Leer.nextDouble();
        System.out.println("Ingrese la variable G: ");
        double Gd = Leer.nextDouble();
        System.out.println("Ingrese La variable H: ");
        double Hd = Leer.nextDouble();
        
        double sexto = (Math.abs(3)*Math.abs(Ad))+Math.abs(Bd)/((Math.abs(Cd)-(Math.abs(Dd)+(Math.abs(5)*Math.abs(Ed))))/(Math.abs(Fd)+(Math.abs(Gd)/(Math.abs(2)*Math.abs(Hd)))));
        System.out.println("El Sexto Resultado Es: " + sexto);*/
        
        double septimo = Math.abs(1.0)/Math.abs(2.0)+Math.abs(7);
        System.out.println("El Septimo Resultado Es: "+septimo);
        
        System.out.println("Ingrese La variable A: ");
        double Ae = Leer.nextDouble();
        System.out.println("Ingrese la variable B: ");
        double Be = Leer.nextDouble();
        System.out.println("Ingrese La variable C: ");
        double Ce = Leer.nextDouble();
        System.out.println("Ingrese la variable D: ");
        double De = Leer.nextDouble();
        
        double octavo = Math.abs(Ae)+Math.abs(Be)/(Math.abs(Ce)-Math.abs(De));
        System.out.println("El Octavo Resultado Es: "+octavo);
        
        double noveno = Math.abs(7)+(Math.abs(1.0)/Math.abs(2.0));
        System.out.println("El Noveno Resultado Es: "+noveno);
        
        System.out.println("Ingrese La variable A: ");
        double AA = Leer.nextDouble();
        System.out.println("Ingrese la variable B: ");
        double BA = Leer.nextDouble();
        System.out.println("Ingrese La variable C: ");
        double CA = Leer.nextDouble();
        System.out.println("Ingrese la variable D: ");
        double DA = Leer.nextDouble();
        
        double decimo = Math.pow(AA, 2)/Math.pow(BA, 2)+Math.pow(CA, 2)/Math.pow(DA, 2);
        System.out.println("El Decimo Resultado Es: "+decimo);
        
        System.out.println("Ingrese La variable A: ");
        double AB = Leer.nextDouble();
        System.out.println("Ingrese la variable B: ");
        double BB = Leer.nextDouble();
        System.out.println("Ingrese La variable C: ");
        double CB = Leer.nextDouble();
        
        double onceavo = Math.pow(AB, 2)+(Math.abs(2.0)*Math.abs(AB)*Math.abs(BB))+Math.pow(BB, 2);
        double onceavoo = Math.abs(1)/ Math.pow(CB, 2) +Math.abs(2);
        double onceavooo = onceavo / onceavoo;
        System.out.println("El Onceavo Resultado Es: "+onceavo);
        System.out.println("El Onceavo Resultado Es: "+onceavoo);
        System.out.println("El Onceavo Resultado Es: "+onceavooo);
    }
}
