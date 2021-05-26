/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerobanco;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Cajerobanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int saldo, mov, op, dinero;
         saldo=840000;
         op=1;
         do{
         System.out.println("Bienvenido al Cajero");  
         System.out.println("Que desea hacer");
         System.out.println("1.- Consultar Saldo");
         System.out.println("2.- Realizar abono o deposito"); 
         System.out.println("3.- Realizar un giro");
         System.out.println("4.- Salir del Programa");
         System.out.print("Elija una Opccion: ");
         mov = leer.nextInt();
         switch(mov){
             case 1: System.out.println("Su saldo es: "+saldo);
             System.out.println("Desea hacr otra operacion 1.- si, 2.- no");
             System.out.print("Elija una Opccion: ");
          op = leer.nextInt();
             break;
             case 2: System.out.print("Cuanto quiere Depositar: ");
             dinero = leer.nextInt();
             if(saldo<dinero){
             System.out.println("no puede realizar el giro");
             System.out.println("no tiene saldo suficiente");
             }
             else{
             saldo=dinero+saldo;
             System.out.println("Su saldo ahora es; "+saldo);
             }
             System.out.println("Desea hacr otra operacion 1.- si, 2.- no");
             System.out.print("Elija una Opccion: ");
          op = leer.nextInt();
             break;
             case 3: System.out.print("Cuanto Quiere Girar: ");
             dinero = leer.nextInt();
             saldo=saldo-dinero;
             System.out.println("Su saldo ahora es; "+saldo);
             System.out.println("Desea hacr otra operacion 1.- si, 2.- no");
             System.out.print("Elija una Opccion: ");
          op = leer.nextInt();
             break;
             case 4: op=2;
             break;
            }
         System.out.println("_________________________________________________"); 
          System.out.println(" "); 
         }while(op==1);
        // TODO code application logic here
    }
    
}
