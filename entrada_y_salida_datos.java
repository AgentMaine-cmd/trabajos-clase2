import java.util.Scanner;
public class entrada_y_salida_datos {
   
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        //-------------------------------------------------------------------------------//
        System.out.println("Introduce tu nombre por favor");
        String NOMBRE_Usuario=lector.nextLine();// al no ser una variable estatica no necesito poner directamente la clase en donde se encuetra
        //------------------------------------------------------------------------------//
        System.out.println("Introduce tu edad por favor");
        int Edad=lector.nextInt();
        //------------------------------------------------------------------------------//
        System.out.println("Hola " + NOMBRE_Usuario + " El año que viene tendras " + (Edad + 1) + " años");
    }
}
