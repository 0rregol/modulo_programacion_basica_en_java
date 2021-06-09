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
public class Estufa extends Electrodomestico{
    private int potencia;

    public Estufa(String marca, String modelo, String pais_fabricacion, int anio_fabricacion, int potencia) {
        super(marca, modelo, pais_fabricacion, anio_fabricacion);
        this.potencia=potencia;
    }

    public Estufa() {
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
