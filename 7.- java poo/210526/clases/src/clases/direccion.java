/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author orregol
 */
public class direccion {
    String calle;
    String comuna;
    String ciudad;
    String region;
    String pais;
    int numero;
    
 public void juntaDireccion(){
     System.out.println("Direccion: "+this.calle+", "+this.numero+", "+this.ciudad+", "+this.comuna+", "+this.region+", "+this.pais);
 }
}
