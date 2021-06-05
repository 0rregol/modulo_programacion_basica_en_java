/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author orregol
 */
public class Libro {

    private String titulo;
    private String autor;
    private int cantidad;
    private int prestados;

    public Libro(String titulo, String autor, int cantidad, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
        this.prestados = prestados;
    }
    
    public Libro(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public void prestamo(){
    if(this.cantidad>this.prestados){
        this.prestados+=1;
        int ep=this.cantidad-this.prestados;
    System.out.println("el libro se te fue prestado y quedan "+ep+" Ejemplares Disponibles");
    }else{System.out.println("No hay suficientes ejemplares para prestarte uno");}
    }
    public void devolucion(){
    this.prestados-=1;
    System.out.println("Gracias por devolver el Libro");
    }
}


