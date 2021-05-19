/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;
package mayorde.pkg3.num;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Mayorde3Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in); 
        int n1, n2, n3;
         System.out.println("ingrse 3 nuemeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        n3 = leer.nextInt();
        
        if((n1>n2)&&(n1>n3)){
    System.out.println("el numero mayor es "+n1);
    }
             if((n2>n1)&&(n2>n3)){
    System.out.println("el numero mayor es "+n2);
    }
                  if((n3>n2)&&(n3>n1)){
    System.out.println("el numero mayor es "+n3);
    }
        // TODO code application logic here
    }
    
}
