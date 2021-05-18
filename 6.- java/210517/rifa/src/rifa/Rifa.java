/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifa;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author orregol
 */
public class Rifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        Random r = new Random();
        int minumero, ganador;
       System.out.println("Bienvenido al sistema que verifica si gano premio");
       System.out.println("Escriba su numero");
        minumero = leer.nextInt();
        ganador = r.nextInt(100);
        if(minumero==ganador){
             System.out.println("ganaste");
        }
           else  {
                     System.out.println("Perdiste, el numero ganador fue"+ganador);
                     }
             
            
        }
        
        
        // TODO code application logic here
    }
    

