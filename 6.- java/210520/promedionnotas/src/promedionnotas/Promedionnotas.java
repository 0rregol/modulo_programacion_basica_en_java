/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedionnotas;
import java.util.Scanner;

/**
 *
 * @author orregol
 */
public class Promedionnotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double prom, nota, suma;
        int op, i;
       suma=0;
       i=0;
        do{ 
        System.out.println("Ingrese una nota");    
        nota = leer.nextInt();
        suma=suma+nota;
        i++;
        System.out.println("¿desea ingresar otra nota? 1,- si, 2.- no");    
        op = leer.nextInt();
        }while(op==1); 
        prom=suma/i;
        System.out.println("El Promdio es: "+prom);
        // TODO code application logic here
    }
    
}
