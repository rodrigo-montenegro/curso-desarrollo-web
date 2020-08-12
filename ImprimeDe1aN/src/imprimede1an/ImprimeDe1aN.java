
package imprimede1an;

import java.util.Scanner;


public class ImprimeDe1aN {


    public static void main(String[] args) {
       
        int limite, cont =1;
        
        System.out.println("Ingrese el limite hasta el cual quiere contar");
        Scanner teclado = new Scanner(System.in);
        limite = teclado.nextInt();
        
        System.out.println("------------------------------");
        
        while(cont <= limite){
            
            System.out.println(cont);
            cont++;
        }
        
    }
    
}
