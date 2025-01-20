package programacion_orientada_a_objetos;

public class POO2 {
    // una variable private solo puede ser accedida de froma directa desde la propia clase
    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;
//estos son los metodos comunes a todos los objetos que cree usando commo base a POO2.
//--------------------------------------------------------------------------------------------------------------------------------------\\

    String color;

    private int peso_total;

    private boolean asientos_cuero,climatizador;


    /*metodo constructor es un metodo especial que se encarga de dar un estado inicial a nuestro objeto
    */

    // metodo constructor
     public POO2(){
        ruedas=4;

        largo=2000;

        ancho=300;

        motor=1600;

        peso_plataforma=500;

        
     }
     /*
        getter:
                funcion:Devolver el valor de las propiedades de los objetos
                Sintaxis: public dato_a_devolver nombre_metodo(){codigo + return}
                el nombre del metodo lo definimos nosotros
      */
      public String ancho_Coche(){// los getter siempre devolveran un valor por lo que siempre necesitaran un return

        return "el largo del coche es " + largo + " centimetros";
      }
      /*
       * setters:
       *          funcion:Modificar el valor de las propiedades de los objetos
       *          sintaxis:public void nombre_metodo(){codigo}
       *          void indica que no devuelva valor y que no debe poner return
       */
      public void color_coche(){// los setters siempre son datos void
        color = "Azul";
      }
      public String dime_color_coche(){
        return "el color del coche es " + color;
      }

    
}

