/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;
import java.util.ArrayList;

/**
 *
 * @author orregol
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
public Fecha(){}

public Fecha(int dia, int mes, int anio){
this.dia=dia;
this.mes=mes;
this.anio=anio;

}

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
public int aBis(int ab, int anio){
int ca4, ca100, ca400;
ca4=anio%4;
ca100=anio%100;
ca400=anio%400;       
if((ca4==0)&&(ca100==0)&&(ca400==0)){
ab=1;
}else{ab=0;}
return ab;
}

public boolean fechaCorrecta(int anio, int mes, int dia,int ab) {
    boolean valido;
    valido=false;
if((mes<13)&&(mes>0)){
   if((mes==1)&&(dia>0)&&(dia<32)){valido = true;}
   if((mes==2)&&(dia>0)&&(dia<29)){valido = true;} 
   if((mes==2)&&(dia==29)&&(ab==1)){valido = true;} 
   if((mes==3)&&(dia>0)&&(dia<32)){valido = true;}
   if((mes==4)&&(dia>0)&&(dia<31)){valido = true;}
   if((mes==5)&&(dia>0)&&(dia<32)){valido = true;}
   if((mes==6)&&(dia>0)&&(dia<31)){valido = true;}
   if((mes==7)&&(dia>0)&&(dia<32)){valido = true;}
   if((mes==8)&&(dia>0)&&(dia<32)){valido = true;}
   if((mes==9)&&(dia>0)&&(dia<31)){valido = true;}
   if((mes==10)&&(dia>0)&&(dia<32)){valido = true;}
   if((mes==11)&&(dia>0)&&(dia<31)){valido = true;}
   if((mes==12)&&(dia>0)&&(dia<32)){valido = true;}
}
    return valido;
}
public int[] diaSiguiente(int dia, int mes, int anio, int ab){
    int[] ds = new int[3];
    int diax, mesx, aniox;
    diax=dia;
    mesx=mes;
    aniox=anio;
   if((mes==1)&&(dia<31)){diax = dia+1;}
   if((mes==1)&&(dia==31)){
       diax = 1; 
       mesx=2;
   }
     if((mes==2)&&(dia<28)){diax = dia+1;}
   if((mes==2)&&(dia==28)&&(ab==0)){
       diax = 1; 
       mesx=3;
   }
     if((mes==2)&&(dia==28)&&(ab==1)){
       diax = 29; 
       
   }
    if((mes==2)&&(dia==29)){
       diax = 1; 
       mesx=3;
   }
 if((mes==3)&&(dia<31)){diax = dia+1;}
   if((mes==3)&&(dia==31)){
       diax = 1; 
       mesx=4;
   }
 if((mes==4)&&(dia<30)){diax = dia+1;}
   if((mes==4)&&(dia==30)){
       diax = 1; 
       mesx=5;
   }
    if((mes==5)&&(dia<31)){diax = dia+1;}
   if((mes==5)&&(dia==31)){
       diax = 1; 
       mesx=6;
   }
    if((mes==6)&&(dia<30)){diax = dia+1;}
   if((mes==6)&&(dia==30)){
       diax = 1; 
       mesx=7;
   }
    if((mes==7)&&(dia<31)){diax = dia+1;}
   if((mes==7)&&(dia==31)){
       diax = 1; 
       mesx=8;
   }
    if((mes==8)&&(dia<31)){diax = dia+1;}
   if((mes==8)&&(dia==31)){
       diax = 1; 
       mesx=9;
   }
    if((mes==10)&&(dia<30)){diax = dia+1;}
   if((mes==10)&&(dia==30)){
       diax = 1; 
       mesx=11;
   }
    if((mes==11)&&(dia<30)){diax = dia+1;}
   if((mes==11)&&(dia==30)){
       diax = 1; 
       mesx=12;
   }
    if((mes==12)&&(dia<31)){diax = dia+1;}
   if((mes==12)&&(dia==31)){
       diax = 1; 
       mesx=1;
       aniox=anio+1;
   }
   ds[0]=diax;
   ds[1]=mesx;
   ds[2]=aniox;
   System.out.println("el dia siguente es: "+diax+"/"+mesx+"/"+aniox);
   
   return ds;
}

}

