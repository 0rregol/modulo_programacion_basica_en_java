/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuemrodelasuerte;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Nuemrodelasuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio, suma, resto,suma2, i;
         System.out.println("Ingrese su dia de Nacimiento");    
        dia = leer.nextInt();
        System.out.println("Ingrese su mes de Nacimiento");    
        mes = leer.nextInt();
        System.out.println("Ingrese su año de Nacimiento");    
        anio = leer.nextInt();
        i=0;
        suma2=0;
        resto=0;
        suma=dia+mes+anio;
        while(suma>0){
            resto=resto+suma%10;
            suma=suma/10;
            i++;
        
        }
       
        System.out.println("el nuemro de la suerte es: "+resto);
        // TODO code application logic here
    }
    
}
