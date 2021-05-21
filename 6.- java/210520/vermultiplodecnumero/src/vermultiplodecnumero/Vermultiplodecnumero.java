/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vermultiplodecnumero;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Vermultiplodecnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int mult, i, num;
          System.out.println("Ingrese el numero que sea el multiplo");    
        mult = leer.nextInt();
        i=1;
        while(i<=100){
            num=i%mult;
            if(num==0){
                System.out.print(i+", "); 
            }
            i++;
            
        }
        System.out.println(" "); 
        // TODO code application logic here
    }
    
}
