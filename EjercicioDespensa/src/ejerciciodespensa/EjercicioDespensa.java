
package ejerciciodespensa;

import java.util.Scanner;

public class EjercicioDespensa {

    
    public static void main(String[] args) {
        
        int tipo = 0;
        double sueldo =0.0;
        
        System.out.println("Por favor ingrese el tipo de empleado");
        System.out.println("1-repositor, 2-cajero, 3-supervisor");
 
        Scanner teclado = new Scanner(System.in);
        tipo = teclado.nextInt();
        
        if(tipo==1){
            sueldo = 15890 + (15890*0.10);
            System.out.println("El sueldo del repositor es de: "+sueldo);
   
        }
        
        if(tipo==2){
            sueldo = 25630.89;
            System.out.println("El sueldo del cajero es de:" +sueldo);
        }
        
        if(tipo==3){
            sueldo = 35560.20 - (35560.20*0.11);
            System.out.println("El sueldo del supervisor es de:" +sueldo);
        }
        
    }
    
}
