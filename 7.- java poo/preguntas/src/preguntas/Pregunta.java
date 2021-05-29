/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;
import java.util.Random;

/**
 *
 * @author orregol
 */
class Pregunta {
    String pregunta, correcta, error1, error2, error3;
    int puntos;
    
public Pregunta(String pregunta,String correcta, String error1, String error2, String error3, int puntos){
this.pregunta=pregunta;
this.correcta=correcta;
this.error1=error1;
this.error2=error2;
this.error3=error3;
this.puntos=puntos;
    
    
}

  
public int MostrarPregunta(){
  System.out.println("Esta Pregunta Vale "+this.puntos+" Pesos");
    System.out.println(this.pregunta);

 Random r = new Random();
 int op, avanza = 0;
 op = r.nextInt(3);
 op=op+1;
 switch(op){
     case 1: System.out.println("1.- "+this.correcta);
             System.out.println("2.- "+this.error1);
             System.out.println("3.- "+this.error2);
             System.out.println("4.- "+this.error3);
             avanza=1;
             break;
     case 2: System.out.println("1.- "+this.error1);
             System.out.println("2.- "+this.correcta);
             System.out.println("3.- "+this.error2);
             System.out.println("4.- "+this.error3);
             avanza=2;
             break;
     case 3: System.out.println("1.- "+this.error1);
             System.out.println("2.- "+this.error2);
             System.out.println("3.- "+this.correcta);
             System.out.println("4.- "+this.error3);
             avanza=3;
             break; 
    case 4: System.out.println("1.- "+this.error1);
             System.out.println("2.- "+this.error2);
             System.out.println("3.- "+this.error3);
             System.out.println("4.- "+this.correcta);
             avanza=4;
             break; 
 }
 

 return avanza;
}
public int C50y50(int avanza){
    int c50;
   
   switch(avanza){
     case 1: System.out.println("1.- "+this.correcta);
             System.out.println("2.- "+this.error1);
            
             break;
     case 2: System.out.println("1.- "+this.error1);
             System.out.println("2.- "+this.correcta);
             
             break;
     case 3: System.out.println("3.- "+this.correcta);
             System.out.println("4.- "+this.error3);
            
             break; 
    case 4: System.out.println("1.- "+this.error1);
            System.out.println("4.- "+this.correcta);
            
             break; 
 }     
    
   return c50=0;

}
public int CPublico(){
    int cp, preg1, preg2, preg3, preg4;
    Random r = new Random();
   preg1 = r.nextInt(99);
   preg2 = r.nextInt(99);
   preg3 = r.nextInt(99);
   preg4 = r.nextInt(99);
    System.out.println("Los Resultados del Public");
    System.out.println(preg1+" personas del publico dicen que la respuesta correcta es "+this.correcta);
    System.out.println(preg2+" personas del publico dicen que la respuesta correcta es "+this.error1);
    System.out.println(preg3+" personas del publico dicen que la respuesta correcta es "+this.error2);
    System.out.println(preg4+" personas del publico dicen que la respuesta correcta es "+this.error3);
   return cp=0; 
}        

public int Ctelefono(){
    int ct, tel;
    Random r = new Random();
      tel = r.nextInt(3);      
if(tel==0){System.out.println( "hola amigo, yo creo que la respuesta correcta es "+this.correcta);}
if(tel==1){System.out.println( "hola amigo, yo creo que la respuesta correcta es "+this.error1);}
if(tel==2){System.out.println( "hola amigo, yo creo que la respuesta correcta es "+this.error2);}
if(tel==3){System.out.println( "hola amigo, yo creo que la respuesta correcta es "+this.error3);}
return ct=0;
}

public int SumaPuntos(int puntaje){
    puntaje=puntaje+this.puntos;
    System.out.println( "Respuesta Correcta"); 
 System.out.println( "llevas ganado "+puntaje+" puntos");   
return puntaje;
}

    
}
