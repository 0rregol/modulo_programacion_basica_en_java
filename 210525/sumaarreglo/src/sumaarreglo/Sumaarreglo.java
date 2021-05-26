/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaarreglo;

import java.util.Scanner;

/**
 *
 * @author orregol
 */
public class Sumaarreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, suma;
        suma=0;
        int[] arreglo;
        arreglo = new int[10];
        for(i=0;i<10;i++){
            System.out.print("ingrese un valor: ");
        arreglo[i] = leer.nextInt();
        
        }
        for(i=0;i<10;i++){
        suma=arreglo[i]+suma;
        
        
        }
        System.out.println("la suma es: "+suma);
        // TODO code application logic here
    }
    
}
