/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercambiar_valor_2_variables;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Intercambiar_valor_2_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        int a, b, temp;
       System.out.println("ingrese un valor para A");
            a = leer.nextInt();
            System.out.println("ingrese un valor para B");
            b = leer.nextInt();
            System.out.println("el valor para A es:"+a+" y el valor para B es:"+b);
            temp=a;
            a=b;
            b=temp;
            
            System.out.println("en nuevo valor para A es:"+a+" y el nuevo valor para B es:"+b);
    }
    
}
