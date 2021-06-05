/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author orregol
 */
public class Cuenta {
    private String cliente;
    private String numCuenta;
     double saldo;
    
    public Cuenta(){}

    public Cuenta(String cliente, String numCuenta, double saldo) {
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public double deposito(double dep, double saldo){
    this.saldo+=dep;
    return saldo;
    }
    public double giro(double gir, double saldo){
    if(saldo>gir){
    this.saldo-=gir;
    }
    else{ System.out.println("no hay saldo suficiente para girar");}
    return saldo;
    }
    
    public double transfrencia(double tra, double saldo){
     if(saldo>tra){
    this.saldo=saldo-tra;
    }
    else{ System.out.println("no hay saldo suficiente para Transferir ese monto");}
  
    return saldo;
    }

}



