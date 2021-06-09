/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;

/**
 *
 * @author orregol
 */
public class Televisor extends Electrodomestico{
    
    private int pulgadas;
    private String so;

    public Televisor(String marca, String modelo, String pais_fabricacion, int anio_fabricacion, int pulgadas, String so) {
        super(marca, modelo, pais_fabricacion, anio_fabricacion);
        this.pulgadas = pulgadas;
        this.so = so;
    }
    @Override
    public void mostrarDatos(){
    System.out.println("Lo cambiamos todo");
    
    
    
    }
}


