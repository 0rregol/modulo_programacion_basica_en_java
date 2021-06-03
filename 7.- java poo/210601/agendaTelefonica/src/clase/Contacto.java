/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author orregol
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String email;
    
    
public Contacto(String nombre, String apellido, String telefono, String direccion, String email){
this.nombre=nombre;
this.apellido=apellido;
this.telefono=telefono;
this.direccion=direccion;
this.email=email;
    }
public void setNombre(String nombre){
this.nombre=nombre;
}  
public String getNombre(){
return nombre;
}
public void setApellido(String apellido){
this.apellido=apellido;
}  
public String getApellido(){
return apellido;
}


public void setTelefono(String telefono){
this.telefono=telefono;
}  
public String getTelefono(){
return telefono;
}
public void setDireccion(String direccion){
this.direccion=direccion;
}  
public String getDireccion(){
return direccion;
}
public void setEmail(String email){
this.nombre=apellido;
}  
public String getEmail(){
return email;
}
}
