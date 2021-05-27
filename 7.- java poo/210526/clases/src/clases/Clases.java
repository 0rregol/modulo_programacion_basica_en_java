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
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        direccion d1= new direccion();
        d1.calle="Las Acacias";
        d1.numero=465;
        d1.ciudad="Peña Blanca";
        d1.comuna="Villa Alemana";
        d1.region="V Regio";
        d1.pais="Chile";
        d1.juntaDireccion();
        // TODO code application logic here
    }
    
}
