/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclase5.Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Johanna
 */
public class Carrito {
    private ItemCarrito[] items;
    private LocalDateTime fecha;

    public Carrito() {
        this.items = new ItemCarrito[3];
        this.fecha = LocalDateTime.now();
    }

    public Carrito(Producto producto, LocalDateTime fecha) {
        this.items = items;
        this.fecha = fecha;
    }

    public ItemCarrito[] getItems() {
        return items;
    }

    public void setItems(ItemCarrito[] items) {
        this.items = items;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public double calcularTotal(){
        double total = 0;
        for(int i=0;i<3;i++){
            ItemCarrito item = items[i];
            total+= item.calcularsubtotal();
        }
        return total;
    }
    
}
