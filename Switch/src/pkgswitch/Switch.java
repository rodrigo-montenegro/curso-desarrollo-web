package pkgswitch;

public class Switch {

    public static void main(String[] args) {
        int dia = 5;
        String nombreDia;
        
     //intruccion switch con tipo de datos int
     switch (dia)
     {
         case 1: nombreDia = "Lunes";
                 break;
         case 2: nombreDia = "Martes";
                 break;
         case 3: nombreDia = "Miercoles";
                 break;
         case 4: nombreDia = "Jueves";
                 break;
         case 5: nombreDia = "Viernes";
                 break;
         case 6: nombreDia = "Sabado";
                 break;
         case 7: nombreDia = "Domingo";
                 break;
         default: nombreDia = "Dia Invalido";
                 break;
                 
     }
        System.out.println("El dia es: "+nombreDia);
     
    }
    
}
