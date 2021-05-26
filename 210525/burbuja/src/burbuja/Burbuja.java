/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;

/**
 *
 * @author orregol
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int i, suma, j, temp;
        suma=0;
        int[] arreglo;
        arreglo = new int[10];
        for(i=0;i<10;i++){
            System.out.print("ingrese un valor: ");
        arreglo[i] = leer.nextInt();
        
        }
        i=0;
        while(i<10){
                j=i+1;
                    while(j<10){
                        if(arreglo[i]>arreglo[j]){
                        temp=arreglo[i];
                        arreglo[i]=arreglo[j];
                        arreglo[j]=temp;
                         } 
                        j++;
                    }
                        i++; 
             
        }
          for(i=0;i<10;i++){
        System.out.print(arreglo[i]+",");
        
        }
        // TODO code application logic here
    }
    
}
