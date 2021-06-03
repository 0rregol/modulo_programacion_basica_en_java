/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author orregol
 */
public class Contador {
private int cont;

public Contador(int cont){  
if(cont>=0){
    this.cont=cont;
}else{
this.cont=0;
}}

public Contador(){}

public int getCont() {
        return cont;
    }

public void setCont(int cont) {
        this.cont = cont;
    }

public int Incrementar(int cont){
        this.cont=cont+1;
return cont;
}
public int Decrementar(int cont){
        this.cont=cont-1;
return cont;
}

 
}





