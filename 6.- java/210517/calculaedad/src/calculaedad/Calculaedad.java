/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaedad;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Calculaedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int ano, actual, edad;
         System.out.println("ingrse su edad de nacimiento");
        ano = leer.nextInt();
         System.out.println("ingrse el año actual");
        actual = leer.nextInt();
        edad=actual-ano;
        if(edad>18){
        System.out.println("tu edad es: "+edad+" y eres mayor de edad");
   
        
        }
        else{
        System.out.println("tu edad es: "+edad+" y eres mayor de edad");
        }
        // TODO code application logic here
    }
    
}
