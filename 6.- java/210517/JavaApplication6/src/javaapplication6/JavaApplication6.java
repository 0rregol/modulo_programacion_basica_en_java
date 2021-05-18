/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author orregol
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        Random r = new Random();
        int jugador1, jugador2;
        System.out.println("elija 0.- piedra, 1.- papel, 2.- tijera");
        jugador1 = leer.nextInt();
        jugador2 = r.nextInt(2);
        if(jugador1==0){
            if(jugador2==0){
            System.out.println("El jugador 1 saco piedra y la computadora saco piedra se declara empate");
            }
         if(jugador2==1){
            System.out.println("El jugador 1 saco piedra y la computadora saco papel, perdiste");
            }
          if(jugador2==2){
            System.out.println("El jugador 1 saco piedra y la computadora saco tijetas, ganaste");
            }
        }
        if(jugador1==1){
            if(jugador2==0){
            System.out.println("El jugador 1 saco Papel y la computadora saco piedra, Ganaste");
            }
         if(jugador2==1){
            System.out.println("El jugador 1 saco Papel y la computadora saco papel se declara empate");
            }
          if(jugador2==2){
            System.out.println("El jugador 1 saco Papel y la computadora saco tijetas, Perdiste");
            }
        }
         if(jugador1==2){
            if(jugador2==0){
            System.out.println("El jugador 1 saco Tijera y la computadora saco piedra, Perdiste");
            }
         if(jugador2==1){
            System.out.println("El jugador 1 saco Tijera y la computadora saco papel, Ganaste");
            }
          if(jugador2==2){
            System.out.println("El jugador 1 saco Tijera y la computadora saco tijetas se declara empate");
            }
        }
        // TODO code application logic here
        
    }
    
}
