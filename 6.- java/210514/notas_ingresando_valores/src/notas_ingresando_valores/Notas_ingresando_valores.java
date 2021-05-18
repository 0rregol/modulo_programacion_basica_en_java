/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas_ingresando_valores;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Notas_ingresando_valores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in);
        double n1, n2, n3, n4, suma, promedio;
        System.out.println("ingrese primera nota");
            n1 = leer.nextDouble();
             System.out.println("ingrese segunda nota");
            n2 = leer.nextDouble();
             System.out.println("ingrese tercera nota");
            n3 = leer.nextDouble();
             System.out.println("ingrese cuarta nota");
            n4 = leer.nextDouble();
            suma=n1+n2+n3+n4;
            promedio=suma/4;
            System.out.println("el promedio es:"+promedio);
    }
    
}
