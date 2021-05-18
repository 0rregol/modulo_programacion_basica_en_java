/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer;
import java.util.Scanner;

/**
 *
 * @author orregol
 */
public class Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scaanner(System.in);
        int numero;
        System.out.println("ingresar un valor para la variable");
            numero = leer.nextInt();
            System.out.println("el valor de la variable numero es:"+numero);
    }
    
}
