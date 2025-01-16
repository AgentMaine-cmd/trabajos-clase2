import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class condicionales {
    // este codigo esta modularizado
    private static void condicional(Scanner lector){
        int edad=lector.nextInt();
        if(edad>18){
            System.out.println("Usted es mayor de edad");
        }else if(edad<0){
            System.out.println("usted no puede existir");
        }else{
            System.out.println("Usted es menor de edad");
        }
        return;
    }
    public static void main(String[] args) throws IOException {
        Scanner lector=new Scanner(System.in);
        BufferedReader prueba=new BufferedReader (new InputStreamReader(System.in));
        //--------------------------------------------------------------------------------------------------------\\
        //System.out.println("introduce tu edad");
        //_--------------------------------------------------------------------------------------------------------\\
        //condicional(lector);
        //---------------------------------------------------------------------------------------------------------\\
        System.out.println("Por favor introduzca un caracter");
        char entradaDatos=(char)prueba.read();
        switch(entradaDatos){
            case 'a':{
                System.out.println("has introducido el valor a");
                break;
            }
            case 'b':{
                System.out.println("has introducido el valor b");
                break;
            }





        }
        lector.close();
    }
}
