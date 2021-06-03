/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author orregol
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio, ab, i;
        ab=0;
        boolean valido;
        String fv;
       System.out.println("ingrese un dia"); 
       dia = leer.nextInt();
       System.out.println("ingrese un mes"); 
       mes = leer.nextInt();
       System.out.println("ingrese un anio"); 
       anio = leer.nextInt();
       Fecha f1;
        f1 = new Fecha(dia, mes, anio);
        ab=f1.aBis(ab, anio);
        valido = f1.fechaCorrecta(anio, mes, dia, ab);
        if(valido==true){ fv="Valida"; }
        else{fv="Invalida";}
         System.out.println("la fecha "+dia+"/"+mes+"/"+anio+" es una fecha "+fv);    
         System.out.println("cuantos dias mas quiere calcular"); 
       i= leer.nextInt();
       do{
            int[] ds = f1.diaSiguiente(dia, mes, anio, ab);
       dia=ds[0];
        mes=ds[1];
        anio=ds[2];
       i--;
       }while(i>0);
       
                // TODO code application logic here
;
    }
    
}
