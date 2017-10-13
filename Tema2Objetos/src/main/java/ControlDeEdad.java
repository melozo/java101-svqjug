public class ControlDeEdad {

    /*
    TODO:
    ~~Puedo pasar una variable y su valor entre clases?~~
    Puedo enviar el valor de la variable
     */
   String unaVariable = "VARIABLE: test desde ControlDeEdad";

    static void esMayorDeEdad (Integer edad) {
        if (edad >= 18) {
            System.out.println("CONTROL DE EDAD: print si");
//            return edad;
//            return unaVariable;
        } else {
            System.out.println("CONTROL DE EDAD: no es mayor");
//            return edad;
        }
    }
}
