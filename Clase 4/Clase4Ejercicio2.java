/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Johanna
 */
public class Clase4Ejercicio2 {

public static void main(String[]args) throws IOException{
    int suma = 0;
    boolean mult=true;
    if(mult==false){
        
    
    String ruta="C:\\Users\\Johanna\\Documents\\GitHub\\curso-de-java-desde-0\\Clase 4\\entrada.txt";
    
    for (String linea : Files.readAllLines(Paths.get(ruta))){
        
            for(String numero:linea.split(" ")){
                int numlin=Integer.parseInt(numero);
                
                suma= suma + numlin;
                
            }
        System.out.println(suma);
    }
}//ejercicio 2.a
    if(mult==true){
    suma=1;
        String ruta="C:\\Users\\Johanna\\Documents\\GitHub\\curso-de-java-desde-0\\Clase 4\\entradaNum.txt";
    
    for (String linea : Files.readAllLines(Paths.get(ruta))){
        
            for(String numero:linea.split(" ")){
                int numlin=Integer.parseInt(numero);
                
                suma= suma * numlin;
                
            }
        System.out.println(suma);
    }
    }
}
}
    


    

