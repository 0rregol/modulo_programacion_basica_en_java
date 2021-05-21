/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operarnnumeros;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Operarnnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
         int par, num, op, suma, mul, mas, np, ni;
      np=0;
      ni=0;
      suma=0;
      mul=1;
         do{
          System.out.println("Ingrese un numero");    
        num = leer.nextInt();
      
            par=num%2;
            if(par==0){
              suma=suma+num;
              np++;
            }
            else{
              mul=mul*num;
              ni++;
            }
            
         System.out.println("¿desea ingresar otra nota? 1,- si, 2.- no");    
        op = leer.nextInt();
        }while(op==1);
     mas=np-ni;
       System.out.println("la suma de los numeros pares es: "+suma);
       System.out.println("la multiplicacion de los numeros impares es: "+mul);
     if(mas>0){
     System.out.println("Hay mas numeros pares");
     }
     if(mas==0){
     System.out.println("hay la misma cantodad de pares e impares");
     }
     if(mas<0){
     System.out.println("hay mas numeros impares");
     }
   
        // TODO code application logic here
    }
    
}
