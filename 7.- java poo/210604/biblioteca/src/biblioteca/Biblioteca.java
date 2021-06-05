/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author orregol
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Libro> milibro = new ArrayList<Libro>();
        int i, l, op;
        String libro;
        milibro.add(new Libro("Cuentos","Hans Christian Andersen",500,200));
        milibro.add(new Libro("Divina comedia","Dante Alighieri",300,200));
        milibro.add(new Libro("Don Quijote de la Mancha","Miguel de Cervantes",1000,200));
        milibro.add(new Libro("Odisea","Ulises",100,100));
        System.out.println("¿Que desea hacer?");
        System.out.println("1.- Pedir un Libro");
        System.out.println("2.- Devolver un libro");
        op = leer.nextInt();
        System.out.println("Ingrese el libro que desea pedir");
                    libro = leer.next();
                    i=0;
                    l=4;
                    while(i<milibro.size()){
                    if(libro.equals(milibro.get(i).getTitulo())){ 
                    l=i;
                    }
                    i++;
                    }
        switch(op){
            case 1: milibro.get(l).prestamo();
                    break;
            case 2: milibro.get(l).devolucion();
                    break;
        }
        // TODO code application logic here
    }
    
}
