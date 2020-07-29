package ifcondicional;

public class IfCondicional {

    public static void main(String[] args) {
        //prueba de la estructura if con dos bloques
        int suma = 0;
        int num = 1;
        int resta = 0;
        int bloqueIf = 0;
        
        if (num > 3) {
            
            suma = num + num;
            System.out.println("El resultado de la suma es: "+ suma);
           bloqueIf = 1;
        }
        
        else {
            
            resta = 15 - num;
            System.out.println("El resultado de la resta es:"+ resta);
           bloqueIf = 2;
        }
        
        System.out.println("El bloque al que entre es el:"+bloqueIf );
    }
    
}
