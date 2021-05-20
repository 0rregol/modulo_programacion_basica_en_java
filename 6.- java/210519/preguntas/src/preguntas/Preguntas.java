/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author orregol
 */
public class Preguntas {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        Random r = new Random();
         int categoria, pregunta, rand;
        System.out.println("elija el tipo de pregunta 1.- Matmatica, 2.- Historia, 3.- cultura General");
        categoria = leer.nextInt();
        switch(categoria){ 
            case 1: rand = r.nextInt(2);
                    if(rand==0){
                     System.out.println("¿A cuánto equivale π?");
                     System.out.println("1.-3.1415, 2.-3.1405, 3.-3.1421");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Correcto");
                     }
                     if(pregunta==2){
                          System.out.println("Error");
                     }
                        if(pregunta==3){
                          System.out.println("Error");
                     }
                    }
                    if(rand==1){
                     System.out.println("¿Qué formula es esta? πx(rxr)");
                     System.out.println("1.-diametro de un criculo, 2.-superficie de un circulo, 3.-volumen de un circulo");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Error");
                     }
                     if(pregunta==2){
                          System.out.println("Correcto");
                     }
                        if(pregunta==3){
                          System.out.println("Error");
                     }
                    }
                    if(rand==2){
                     System.out.println("¿Qué expresa esta formula?e = mc²  ");
                     System.out.println("1.-Equivalencia entre masa y volumen, 2.-Equivalencia entre masa y energia , 3.-Equivalencia entre masa y velocidad");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Error");
                     }
                     if(pregunta==2){
                          System.out.println("Correcto");
                     }
                        if(pregunta==3){
                          System.out.println("Error");
                     }
                    }
                    break;
                case 2: rand = r.nextInt(2);
                    if(rand==0){
                     System.out.println("¿Dónde originaron los juegos olímpicos?");
                     System.out.println("1.-Grecia, 2.-Roma, 3.-Babilonia");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Correcto");
                     }
                     if(pregunta==2){
                          System.out.println("Error");
                     }
                        if(pregunta==3){
                          System.out.println("Error");
                     }
                    }
                    if(rand==1){
                     System.out.println("¿Qué año llegó Cristóbal Colón a América?");
                     System.out.println("1.-1541, 2.-1542, 3.-1543");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Error");
                     }
                     if(pregunta==2){
                          System.out.println("Correcto");
                     }
                        if(pregunta==3){
                          System.out.println("Error");
                     }
                    }
                    if(rand==2){
                     System.out.println("¿Cuál fue el primer metal que empleó el hombre?");
                     System.out.println("1.-Bronce, 2.-Acero , 3.-Cobre");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Error");
                     }
                     if(pregunta==2){
                          System.out.println("Error");
                     }
                        if(pregunta==3){
                          System.out.println("Correcto");
                     }
                    }
                    break;
                     case 3: rand = r.nextInt(2);
                    if(rand==0){
                     System.out.println("¿Qué instrumento óptico permite ver los astros de cerca?");
                     System.out.println("1.-Telescopia, 2.-Microscopio, 3.-Giroscopio");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Correcto");
                     }
                     if(pregunta==2){
                          System.out.println("Error");
                     }
                        if(pregunta==3){
                          System.out.println("Error");
                     }
                    }
                    if(rand==1){
                     System.out.println("¿Quién escribió “Hamlet”?");
                     System.out.println("1.-William Shakespeare, 2.-Oliver Atom, 3.-JJ Benitez");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Correcto");
                     }
                     if(pregunta==2){
                          System.out.println("Error");
                     }
                        if(pregunta==3){
                          System.out.println("Error");
                     }
                    }
                    if(rand==2){
                     System.out.println("¿Cuál es el metal más caro del mundo?");
                     System.out.println("1.-oro, 2.-platino , 3.-rodio");
                     pregunta = leer.nextInt();
                     if(pregunta==1){
                          System.out.println("Error");
                     }
                     if(pregunta==2){
                          System.out.println("Error");
                     }
                        if(pregunta==3){
                          System.out.println("Correcto");
                     }
                    }
                    break;
                    
        }
            
        // TODO code application logic here
    }
    
}
