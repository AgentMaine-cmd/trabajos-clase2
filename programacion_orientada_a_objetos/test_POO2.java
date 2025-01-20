package programacion_orientada_a_objetos;

public class test_POO2 {
    public static void main (String[]args){
        POO2 coche1=new POO2(); // instanciar una clase. EJEMPLAR DE CLASE
        //para poder utilizar el getter primero debo declarar en la main el setter 
        coche1.color_coche();
        //System.out.println(coche1.ancho_Coche()); con esto somos capaces de mostrar el ancho del coche gracias al metodo getter
        
        System.out.println(coche1.dime_color_coche());
    }

}
