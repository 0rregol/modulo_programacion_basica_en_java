/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horavalida;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Horavalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int hora, min, seg;
        do{
        System.out.println("Ingrese hora");    
        hora = leer.nextInt();
         if((hora>23)||(hora<0)){
             System.out.println("Ingrese una hora valida");
         }
        }while((hora>23)||(hora<0));
        do{
        System.out.println("Ingrese min");    
        min = leer.nextInt();
         if((min>59)||(min<0)){
             System.out.println("Ingrese un min valido");
         }
          }while((min>59)||(min<0));
       do{
        System.out.println("Ingrese seg");    
        seg = leer.nextInt();
         if((seg>59)||(seg<0)){
             System.out.println("Ingrese un min seg");
         }
          }while((seg>59)||(seg<0));
        // TODO code application logic here
        System.out.println("la hora ingresada es: "+hora+":"+min+":"+seg);
    }
    
}
