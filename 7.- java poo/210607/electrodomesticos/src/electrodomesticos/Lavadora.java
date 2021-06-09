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
public class Lavadora extends Electrodomestico{
    private int litros;

    public Lavadora(String marca, String modelo, String pais_fabricacion, int anio_fabricacion, int litros) {
        super(marca, modelo, pais_fabricacion, anio_fabricacion);
        this.litros=litros;
    }

    public Lavadora() {
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
   
    
}
