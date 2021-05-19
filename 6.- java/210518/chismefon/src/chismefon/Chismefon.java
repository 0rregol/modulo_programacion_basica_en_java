/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chismefon;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Chismefon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int tiempo, suma, horario,temp, valor;
        System.out.println("Ingrese horario 1.vespertino, 2.- matutino, 3.- domingo todo el día");    
        horario = leer.nextInt();
         System.out.println("Ingrese cantidad de minutos hablados");    
        tiempo = leer.nextInt();
        suma=0;
        valor=0;
         while(tiempo>0){
                while (tiempo>5){
                      while(tiempo>8){
                          while(tiempo>10){
                                        suma = suma+50;
                                        tiempo--;
                                         
                                }
                            suma=suma+70;
                            tiempo--;
                            }	
                        suma=suma+80;
                        tiempo--;
                        }
                     suma=suma+100;
                     tiempo--;
                     }
                  if(horario==1){
                      temp=(suma*15)/100;
                    valor =suma+temp;
                  }
                    if(horario==2){
                      temp=(suma*10)/100;
                    valor =suma+temp;
                  }
                 if(horario==3){
                      temp=(suma*3)/100;
                    valor =suma+temp;
                  }
                    
         System.out.println("el valor de la llamada es: "+valor);
             
        // TODO code application logic here
    }
    
}
