/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroperfecto;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Numeroperfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         long num, suma, n2, resto;
         int i;
          System.out.println("Ingrese un numero");    
        num = leer.nextLong();
          i=1;
          n2=num/2;
          suma=0;
          while(i<=n2){
          resto=num%i;
          if(resto==0){
          suma=suma+i;
          }
          i++;
           }
          if(suma==num){
          System.out.println("el numero "+num+" es perfecto");  
          }
          else{
          System.out.println("el numero "+num+" no es perfecto");   
          }
         
        
        
        // TODO code application logic here
    }
    
}
