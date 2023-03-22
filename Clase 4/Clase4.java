/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg4;

import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class Clase4 {
    //ejercicio 1.b
 public static int[] orden(int a,int b,int c,boolean may){
    
    int numeros[]= new int[3];
    numeros[0]=a;
    numeros[1]=b;
    numeros[2]=c;
    int auxiliar;
   
    
    
    if(may==false){
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
        
          return numeros;  
        
    
    }
 
    public static void main(String[] args) {
        
        //Primero declaro las variables antes de comenzar los ejercicios
        Scanner teclado= new Scanner(System.in);
        int[] ordenados;
        int num1;
        int num2;
        int num3;
        boolean booleano;
        //1.c
        if(args.length==0){//pregunto si el valor de args es igual a 0 para ingresar valores con los que trabajar
            //1.b
            
            System.out.println("Por favor ingrese su dato 1 a ordenar");
             num1 = teclado.nextInt();
            System.out.println("Por favor ingrese su dato 2 a ordenar");
             num2=teclado.nextInt();
            System.out.println("Por favor ingrese su dato 3 a ordenar");
             num3=teclado.nextInt();
            System.out.println("si quiere un orden ascendente escriba false de lo contrario escriba true");
            booleano=teclado.nextBoolean();
        } else{//si el valor de args es distinto de 0 uso esos valores que vienen asignados como parametros de args
        
            //1.a
            num1=Integer.parseInt(args[0]);
            num2=Integer.parseInt(args[1]);
            num3=Integer.parseInt(args[2]);
            System.out.println("Por favor si quiere ordenar de menor a mayor escriba true,de lo contrario escriba false");
            booleano=teclado.nextBoolean();
            
        }           
       
            
            
            
            ordenados=Clase4.orden( num1, num2, num3, booleano);
            for(int i=0;i<ordenados.length;i++){
                System.out.println(ordenados[i]);
            }
        }
            }
            
            
            
            
        



    
    

