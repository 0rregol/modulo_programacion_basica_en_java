/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteriainternacional;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Paqueteriainternacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          int gramos, destino, costo;
        System.out.println("los gramos que pesa el paquete");    
        gramos = leer.nextInt();
        if(gramos<5001){
             System.out.println("ingrse la zona de destino 1.- Amrica del Norte 2.- America Central, 3.- America del Sur, 4.- Europa, 5.- Asia");    
        destino = leer.nextInt();
        switch(destino){
            case 1: costo=gramos*110;                
                System.out.println("el costo de envio es: "+costo);  
            break;
            case 2: costo=gramos*100;                
                System.out.println("el costo de envio es: "+costo);  
            break;
            case 3: costo=gramos*120;                
                System.out.println("el costo de envio es: "+costo); 
            break;
            case 4: costo=gramos*240;                
                System.out.println("el costo de envio es: "+costo); 
            break;
            case 5: costo=gramos*270;                
                System.out.println("el costo de envio es: "+costo);  
            break;
           
        
        }
        }
        else{ System.out.println("no enviamos paquetes que pesen mas de 5 kilos");   }
        // TODO code application logic here
    }
    
}
