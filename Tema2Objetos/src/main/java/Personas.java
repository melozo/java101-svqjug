public class Personas {

    //Variables de clase
    String nombre;
    Integer edad;
    String primerApellido;
    String segundoApellido;
    // fin variables de clase

    // TODO: Es necesario instanciar cada vez que quiero usar metodos de otras clases?
    // no, podemos usar metodos estaticos (static blau ...)
    // fin

    public static void main(String[] args) {

        Personas manuel = new Personas();
        Personas pepa = new Personas();

        manuel.nombre = "Manuel";
        pepa.nombre = "Pepa";
        manuel.edad = 35;
        pepa.edad = 37;

        /*
        if (manuel.edad >= 18){
            System.out.println(manuel.nombre + " es mayor de edad");
        } else System.out.println("no es mayor");
        */
        ControlDeEdad.esMayorDeEdad(manuel.edad);

//        manuel.controlDeEdad.esMayorDeEdad(manuel.edad);

        // ¿quien es mayor?...
        if (manuel.edad > pepa.edad){
            System.out.println(manuel.nombre + "Es mayor");
        } else {
            System.out.println(pepa.nombre + "!!! Es mayor");
        }


        // ¿qué cadena es más extensa?

        if (manuel.nombre.length() > pepa.nombre.length()){
            System.out.println("Manuel tiene más elementos que " + pepa.nombre);
            System.out.println("Manuel tiene: " + manuel.nombre.length());
            System.out.println("Pepa tiene: " + pepa.nombre.length());
        } else {
            System.out.println(pepa.nombre + "!!!");
        }

        //System.out.println(manuel.acciones.cantar() + " mira el " + manuel + "como canta");
        //System.out.println("Mira el " + manuel.nombre + " como canta: " + Acciones.cantar);
        System.out.print("Mira er " + manuel.nombre + " como canta...");
//        manuel.();

        System.out.println(pepa.nombre);
//       pepa.acciones.dormir();
        System.out.println(pepa.nombre);
//      pepa.acciones.cantar();

        Acciones.dormir();

        ControlDeEdad.esMayorDeEdad(pepa.edad);
//        String elementoDePepa1 = pepa.acciones.toString();
//        System.out.println(elementoDePepa1);
    }
}
