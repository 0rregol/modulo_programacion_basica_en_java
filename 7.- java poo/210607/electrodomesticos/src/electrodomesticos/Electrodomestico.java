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
public class Electrodomestico {
    private String marca;
     private String modelo;
      private String pais_fabricacion;
       private int anio_fabricacion;

    public Electrodomestico(String marca, String modelo, String pais_fabricacion, int anio_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.pais_fabricacion = pais_fabricacion;
        this.anio_fabricacion = anio_fabricacion;
    }
 public Electrodomestico(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPais_fabricacion() {
        return pais_fabricacion;
    }

    public void setPais_fabricacion(String pais_fabricacion) {
        this.pais_fabricacion = pais_fabricacion;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    void mostrarDatos(){
    System.out.println("Marca: "+this.marca);
    System.out.println("Modelo: "+this.modelo);
    System.out.println("Pais de Fabricacion: "+this.pais_fabricacion);
    System.out.println("Año de Fabricacion: "+this.anio_fabricacion);
    
    }
}
