import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class bucles {
      /*     Scanner lector=new Scanner(System.in); este es un codigo para adivinar un numero del 1 al 10 funcional
        //----------------------------------------------------------------\\
        boolean hasAcertado =true;
        int[] numeros={1,2,3,4,5,6,7,8,9,10};
        int numeroAleatorio=(int)(Math.random()*numeros.length);
        //-----------------------------------------------------------------\\
        System.out.println(numeroAleatorio);
        //------------------------------------------------------------------\\
        while(hasAcertado){
            int numero;
            System.out.println("introoduce un numero ");
            numero=lector.nextInt();
            if(numero==numeroAleatorio){
                System.out.println("has acertado toma un pin pa ti");
                hasAcertado=false;
            }else{
                System.out.println("has fallado prueba de nuevo");
                hasAcertado=true;
            }
        }
        lector.close();
         * 
         */


            /*Scanner lector=new Scanner(System.in); //programa que pide una contraseña y si la aciertas te salta un mensaje
        String clave="Jose";
        String contraseña="";

        while(clave.equals(contraseña)==false){
            System.out.println("Por favor introduzca la cotraseña");
            contraseña=lector.nextLine();
            if(clave.equals(contraseña)==false){
                System.out.println("Has fallado pringado");

            }
        }
      System.out.println("has acertado bienvenido al programa");
       */ 
    public static void main(String[]args) throws IOException{
        
        
                BufferedReader Lector = new BufferedReader(new InputStreamReader(System.in));
                boolean hasAcertado = false;  // Cambié el valor inicial a false, porque quieres que el bucle se ejecute hasta que acierte
                int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                
                // Seleccionamos un número aleatorio dentro del arreglo 'numeros'
                int indiceAleatorio = (int) (Math.random() * numeros.length); // Generamos un índice aleatorio entre 0 y 9
                int NumerosAleatorios = numeros[indiceAleatorio]; // Obtenemos el número aleatorio en el arreglo
                
                int numero;
                int i=0;
                do {
                    
                    i++;
                    System.out.println("Introduce un número: ");
                    String input = Lector.readLine();  // Leemos la línea completa
                    numero = Integer.parseInt(input);  // Convertimos la entrada en un número entero
        
                    if (numero == NumerosAleatorios) {
                        System.out.println("¡Has acertado! en ." + i + " intentos, toma un pin pa ti");
                        hasAcertado = true;
                    } else {
                        System.out.println("¡Has fallado! Prueba de nuevo.");
                    }
                } while (!hasAcertado);  // El bucle se repite hasta que el jugador acierte
                
            }
        }
