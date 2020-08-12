/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciob;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class EjercicioB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero, porcentaje, resultado;
        System.out.println("Ingrese el numero a calcular el porcentaje");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextDouble();
        
        System.out.println("Ingrese el porcentaje a calcular");
        Scanner teclado2 = new Scanner(System.in);
        porcentaje = teclado2.nextDouble();
        
        resultado = numero * porcentaje;
        
        System.out.println("El resultado del porcentaje es: " + resultado );
    }
    
}
