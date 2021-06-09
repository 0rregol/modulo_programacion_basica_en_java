/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author orregol
 */
public class Electrodomesticos {

        
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Televisor> tv = new ArrayList<Televisor>();
        ArrayList<Lavadora> lava = new ArrayList<Lavadora>();
        ArrayList<Estufa> estu = new ArrayList<Estufa>();
        int i, t, l, e, op;
        i=0;
        tv.add(new Televisor("lg","colorfull", "Korea", 2020, 45, "androidtv"));
        tv.add(new Televisor("Samsung","colorfull", "Korea", 2018, 45, "androidtv"));
        tv.add(new Televisor("Sony","Triniton", "Japon", 2021, 42, "androidtv"));
        tv.add(new Televisor("Sharp","43u32", "Japon", 2019, 43, "androidtv"));
        lava.add(new Lavadora("lg","Wm12wvc4s6", "Korea", 2020, 45));
        lava.add(new Lavadora("Samsung","Perfect Care 11wd", "Korea", 2018, 45));
        estu.add(new Estufa("Somela ","Termoventilador", "Chile", 2021, 1500));
        estu.add(new Estufa("Fensa","Fhk 990", "China", 2019, 2000));
         System.out.println("¿Que desea hacer?");
        System.out.println("1.- Ver Televisores");
        System.out.println("2.- Ver Lavadoras");
        System.out.println("3.- Ver Estufas");
        op = leer.nextInt();
        switch(op){
            case 1: tv.get(i).mostrarDatos();
            break;
            case 2: 
                while(i<lava.size()){
                lava.get(i).mostrarDatos();
                System.out.println("_____________________________");
                    i++;
                }
                break;
            case 3: 
                while(i<estu.size()){
                estu.get(i).mostrarDatos();
                    i++;
                }
                break;
        
        }
        // TODO code application logic here
    }
    
    }
   
