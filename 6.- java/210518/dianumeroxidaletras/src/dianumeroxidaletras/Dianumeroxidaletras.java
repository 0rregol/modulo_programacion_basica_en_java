/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dianumeroxidaletras;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Dianumeroxidaletras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          int dia;
        System.out.println("Ingrese el numero de dia");    
        dia = leer.nextInt();
        switch(dia){
            case 1: System.out.println("el dia 1 es Lunes");  
            break;
        case 2: System.out.println("el dia 2 es Martes");  
            break;
            case 3: System.out.println("el dia 3 es Miercoles");  
            break;
            case 4: System.out.println("el dia 4 es Jueves");  
            break;
            case 5: System.out.println("el dia 5 es Viernes");  
            break;
            case 6: System.out.println("el dia 6 es Sabado");  
            break;
            case 7: System.out.println("el dia 7 es Domingo");  
            break;
        
        }
        // TODO code application logic here
    }
    
}
