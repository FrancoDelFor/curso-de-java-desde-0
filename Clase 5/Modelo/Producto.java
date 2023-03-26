/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclase5.Modelo;

/**
 *
 * @author Johanna
 */
public class Producto {
    private String nombre;
    private Double precio;
   

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
       
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    

    
    
}

