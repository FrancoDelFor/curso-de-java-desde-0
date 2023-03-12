

package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class TrabajoPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaracion de variables
	Scanner leer= new Scanner(System.in);
        boolean ingresosAltos,avion = false;
        ingresosAltos = false;
        
        //ingresos de datos
        System.out.println("ingrese el valor de sus ingresos mensuales");
        float ingresosMensuales = leer.nextFloat();
        System.out.println("ingrese la cantidad de vehiculos que posee");
        int vehiculos= leer.nextInt();
        System.out.println("ingrese la cantidad de inmuebles que posee");
        int inmuebles= leer.nextInt();
        System.out.println("¿posee alguna embarcacion o aviones de lujo?(1 para si ,2  para no)");
        int artlujo= leer.nextInt();
        switch (artlujo){
            case 1 -> avion=true;
            case 2 -> avion=false;
                    
            default -> System.out.println("la opcion ingresada no es correcta");
        }
        //proceso de datos
        if((ingresosMensuales >=489083)||(vehiculos>=3)||(inmuebles>=3)||(avion == true)){
            //salida de informacion
            System.out.println("Usted pertenece al grupo de ingresos altos");
            ingresosAltos=true;
        }else{
            //salida de informacion
            System.out.println("Usted no pertenece al grupo de ingresos altos");
            ingresosAltos=false;
        }
        
}
}



			    
			
				
	



    

