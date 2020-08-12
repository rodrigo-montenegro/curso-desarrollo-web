/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciog;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class EjercicioG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,aux;
        
        System.out.println("Ingrese un numero a:");
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        
        System.out.println("Ingrese un numero b:");
        Scanner teclado2 = new Scanner(System.in);
        b = teclado2.nextInt();
        
        aux = b;
        b = a;
        a = aux;
        
        System.out.println("Los valores intercambiados son: ");
        System.out.println("a: "+a);
        System.out.println("b:" +b);
        
        
    }
    
}
