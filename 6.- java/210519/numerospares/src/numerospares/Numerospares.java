/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospares;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Numerospares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int par, limit, i;
          System.out.println("Ingrese hasta que numero quiere llegar");    
        limit = leer.nextInt();
        i=2;
        while(i<=limit){
            par=i%2;
            if(par==0){
                System.out.print(i+", "); 
            }
            i++;
            
        }
        System.out.println(" "); 
        // TODO code application logic here
    }
    
}
