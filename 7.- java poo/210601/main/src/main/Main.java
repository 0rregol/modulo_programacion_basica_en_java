/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
         System.out.println("ingrese un valor");
        int cont = leer.nextInt();
        Contador c1 = new Contador(cont);
        
       
         System.out.println("elija 1.- Incrementar, 2.- Decrementar");
          int op = leer.nextInt();     
          if(op==1){
          cont=c1.Incrementar(cont);
           System.out.println("el valor incrementado es "+c1.getCont());
          }
           if(op==2){
          cont=c1.Decrementar(cont);
           System.out.println("el valor Decrementado es "+c1.getCont());
          }
        // TODO code application logic here
    }
    
}
