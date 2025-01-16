import java.util.Scanner;
public class bucles {
      /*     Scanner lector=new Scanner(System.in); este es un coidog para adivinar un numero del 1 al 10 funcional
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
    public static void main(String[]args){
        Scanner lector=new Scanner(System.in);
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
   
    }
}
