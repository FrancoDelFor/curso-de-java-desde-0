/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg3;

import java.util.Scanner;
public class Clase3ejercicio2 {
    public static String codificarTexto(int num,String txt1){
        String txt2="";
        String abecedario="abcdefghijklmnñopqrstuvwxyz";
        for(int i=0;i<txt1.length();i++){
            for(int x=0;x<abecedario.length();x++){
                if(txt1.charAt(i)==abecedario.charAt(x)){
                    txt2=txt2+abecedario.charAt(x+num);
                    
                }
            }
        }
        return txt2;
        
    }
    public static void main(String[]arg){
       
        Scanner teclado= new Scanner(System.in);
       System.out.println("Por favor ingrese el texto a codificar");
        String txt1 = teclado.nextLine();
         System.out.println("por favor ingrese la cantidad de lugares a desplazar");
        int num = teclado.nextInt();
        String txt2 =Clase3ejercicio2.codificarTexto(num, txt1);
        System.out.println(txt2);
        
    }
    
}
