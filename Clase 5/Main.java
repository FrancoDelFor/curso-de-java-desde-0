/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase5;

import ejercicioclase5.Modelo.Carrito;
import ejercicioclase5.Modelo.ItemCarrito;
import ejercicioclase5.Modelo.Producto;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Johanna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Carrito carrito1= new Carrito();
        int i= 0;
        try {
           
            for(String linea: Files.readAllLines(Paths.get("C:\\Users\\Johanna\\Documents\\NetBeansProjects\\Clase5\\src\\Modelo\\Archivo.txt"))){
                System.out.println(linea);
                String nombre= linea.split(";")[0];
                int cantidad= Integer.parseInt(linea.split(";")[1]);
                double precio= Double.parseDouble(linea.split(";")[2]);
                Producto producto = new Producto(nombre,precio);
                ItemCarrito itemCarrito = new ItemCarrito(producto,cantidad);
                
                carrito1.getItems()[i]= itemCarrito;
                i++;
            }
            
            System.out.println("importe total: "+carrito1.calcularTotal());
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    
}
