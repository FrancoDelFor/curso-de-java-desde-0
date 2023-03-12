/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg3;

import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class Clase3ejercicio1 {
    private Scanner teclado;
    public static void main(String[] args) {
        
        Clase3ejercicio1 hola= new Clase3ejercicio1();
        //hola.cantidadLetra();
        hola.orden();
        //hola.suma();
    }
    //Ejercicio 1
    //1.a
    public void cantidadLetra(){
            teclado= new Scanner(System.in);
            String txt1="ingrese un texto por favor";
            String txt2="ingrese una letra para contar cuantas veces aparece dentro del texto";
        
            System.out.println(txt1);
            String txt = teclado.nextLine();
            System.out.println(txt2);
            String letra= teclado.nextLine();
        
            String[] partido = txt.split(letra);
            System.out.println("En la oracion "+txt+" la letra: "+letra+" aparece "+(partido.length-1)+" veces");
    }

//1.b

    public void orden(){
    
    int numeros[]= new int[3];
    
    int auxiliar;
    boolean maymen=true;
    for(int i=0;i<numeros.length;i++){
        Scanner teclado= new Scanner(System.in);
        numeros[i]=teclado.nextInt();
    }
    if(maymen==false){
        for(int i=0;i<numeros.length;i++){
            for(int j=i+1;j<3;j++){
                if(numeros[i]<numeros[j]){
                    auxiliar=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=auxiliar;
                }else{
                    auxiliar=numeros[j];
                    numeros[j]=numeros[i];
                    numeros[i]=auxiliar;
                }
               
            }
        }
    }
    for(int i=0;i<numeros.length;i++){
        System.out.println(numeros[i]);
    }
        
            
        
    
    }
    
    
    
//1.c
    
    public void suma(){
        
        Scanner teclado=new Scanner(System.in);
        int numeros[]= new int[2];
        int sumados=0;
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingrese "+numeros.length+" para hacer una suma");
            System.out.println("Por favor ingrese el numero "+(i+1));
            numeros[i]= teclado.nextInt();
            sumados= sumados+numeros[i];
            
        }
        System.out.println("el resultado de la suma es: "+sumados);
    }
    
    
}




    

