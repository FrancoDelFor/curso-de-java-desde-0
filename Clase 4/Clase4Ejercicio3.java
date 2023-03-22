/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class Clase4Ejercicio3 {

    public static String codificarTexto(int num,String txt1,int codif){
        String txt2="";
        String abecedario="abcdefghijklmnñopqrstuvwxyz";
        switch(codif){
            case 1 -> {    
                for(int i=0;i<txt1.length();i++){
                    for(int x=0;x<abecedario.length();x++){
                        if(txt1.charAt(i)==abecedario.charAt(x)){
                            txt2=txt2+abecedario.charAt(x+num);
                            
                        }
                    }
                }   }
            case 2 -> { 
                for(int i=0;i<txt1.length();i++){
                    for(int x=0;x<abecedario.length();x++){
                        if(txt1.charAt(i)==abecedario.charAt(x)){
                            txt2=txt2+abecedario.charAt(x-num);
                            
                        }
                    }
                }   }
            default -> System.out.println("la opcion ingresada no es correcta");
        }
        
        return txt2;
        
    }
    public static void main(String[] args) throws IOException{
        Scanner teclado= new Scanner(System.in);
      
       
       String ruta= "C:\\Users\\Johanna\\Documents\\GitHub\\curso-de-java-desde-0\\Clase 4\\entradaTexto.txt";
       for (String linea : Files.readAllLines(Paths.get(ruta))){
        
            String txt1=linea;
             System.out.println("por favor ingrese la cantidad de lugares a desplazar");
        int num = teclado.nextInt();
        System.out.println("por favor ingrese 1 para codificar el texto o 2 para decodificar el texto");
        int codif = teclado.nextInt();
       
        String txt2 =codificarTexto(num,txt1,codif);
        System.out.println(txt2);
        Files.writeString(Paths.get("C:\\Users\\Johanna\\Documents\\GitHub\\curso-de-java-desde-0\\Clase 4\\salida.txt"), txt2);
            
            }
        
    }
    }


    

   