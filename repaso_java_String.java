public class repaso_java_String{
    public static void main(String[]args){
        String nombre="jose almansa moreno";
        System.out.println("mi nombre es " + nombre);//esto para imprimir nombre
        //--------------------------------------------------------------------------------------------------------------------------//
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");//length lo usamos para poder saber el numero de caracteres que hay en el String
        //-------------------------------------------------------------------------------------------------------------------------//
        System.out.println("la primera letra de mi nombre es " + nombre.charAt(0));//charat lo usamos para saber lo que hay en la posicion que le indicamos

        int ultima_letra;
        ultima_letra=nombre.length();
        System.out.println("y la ultima letra es " + nombre.charAt(ultima_letra -1));//recuerda que charat empieza siempre en cero, debes restar 1 para que no se vaya de posicion
        //-------------------------------------------------------------------------------------------------------------------------//
        String frase="Hoy me voy acagar en la puta madre del que desarrollo java";
        //-------------------------------------------------------------------------------------------------------------------------//
        int final_de_frase_original=frase.length();
        String frase_resumen=frase.substring(14,final_de_frase_original);//el subString lo que realiza es dividir el string original, desde donde le indicamos hasta
                                                         //donde no queremos extraer, o lo que es mas desde donde queremos hasta el espacio siguiente al que queremos en verdad
        System.out.println("la frase resumida es " + frase_resumen);
        //------------------------------------------------------------------------------------------------------------------------//
        String Alumno1, alumno2,alumno3;
        Alumno1="David";
        alumno2="David";
        alumno3="david";
        //------------------------------------------------------------------------------------------------------------------------//
        System.out.println(Alumno1.equals(alumno2));//compara 2 cadenas de caracteres es capaz de diferenciar mayusculas de minusculas
        //------------------------------------------------------------------------------------------------------------------------//
        System.out.println(Alumno1.equalsIgnoreCase(alumno3) + " aqui usamos equalsignorecase");//este permite ignorar las diferencias en mayusculas y minusculas



    }
}