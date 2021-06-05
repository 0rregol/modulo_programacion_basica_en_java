/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author orregol
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Cuenta> cuenta = new ArrayList<Cuenta>();
        double saldo, dep, gir, tra, saldot;
        int op, i, u, a;
        String numCuenta;
        String cliente;
        //String[] nc = new String[3];
        //String[] nom = new String[3];
        //double[] sal = new double[3];
        cuenta.add(new Cuenta("Juan Perez","1",500));
        cuenta.add(new Cuenta("Raul Perez","2",550));
        cuenta.add(new Cuenta("Diego Perez","3",100));
       // nc[0]=c1.getNumCuenta();
        //nc[1]=c2.getNumCuenta();
        //nc[2]=c3.getNumCuenta();
        //nom[0]=c1.getCliente();
        //nom[1]=c2.getCliente();
        //nom[2]=c3.getCliente();
        //sal[0]=c1.getSaldo();
        //sal[1]=c1.getSaldo();
        //sal[2]=c1.getSaldo();
        System.out.println("Ingrese su numero de Cuenta");
        numCuenta = leer.next();
        i=0;
        u=4;
        a=4;        
        while(i<cuenta.size()){
        if(numCuenta.equals(cuenta.get(i).getNumCuenta())){ 
            u=i;
        }
        i++;
        }
        
     System.out.println("Bienvenido "+cuenta.get(u).getCliente());
     
        //System.out.println("Bienvenido "+nom[u]); 
        do{
        System.out.println("Que Desea Hacer"); 
        System.out.println("1.- Depositar");
        System.out.println("2.- Girar");
        System.out.println("3.- Transferir");
        System.out.println("4.- Salir");
        op = leer.nextInt();
        switch(op){
            case 1: System.out.println("Ingrese Monto a Depositar"); 
                    dep = leer.nextDouble();
                    saldo= cuenta.get(u).getSaldo();
                    saldo = cuenta.get(u).deposito(dep, saldo);
                    System.out.println("Su Saldo es: "+cuenta.get(u).getSaldo());
                    break;
            case 2: System.out.println("Ingrese Monto a Girar"); 
                    gir = leer.nextDouble();
                    saldo= cuenta.get(u).getSaldo();
                    saldo=cuenta.get(u).giro(gir, saldo);
                    System.out.println("Su Saldo es: "+cuenta.get(u).getSaldo());
                    break;
            case 3: System.out.println("Ingrese Monto a Girar"); 
                    tra = leer.nextDouble();
                    System.out.println("Ingrese Cuenta a Transferir"); 
                    numCuenta = leer.next();
                    saldo= cuenta.get(u).getSaldo();
                    saldo=cuenta.get(u).transfrencia(tra, saldo);
                    i=0;
                    while(i<cuenta.size()){
                        if(cuenta.get(i).getNumCuenta().equals(numCuenta)){ 
                                a=i;
                            }
                        i++;
                    }
                    dep=tra;
                    saldot = cuenta.get(a).getSaldo();
                    saldot = cuenta.get(a).deposito(dep, saldot);
                     System.out.println("El saldo de "+cuenta.get(u).getCliente()+" Ahora es: "+cuenta.get(u).getSaldo());
                    System.out.println("El saldo de "+cuenta.get(a).getCliente()+" Ahora es: "+cuenta.get(a).getSaldo());
                    break;
            case 4: op=4;
                    System.out.println("Gracias por venir al banco");
        
        }
        System.out.println("_________________________________________");
        }while(op!=4);
        // TODO code application logic here
    }
    
}
