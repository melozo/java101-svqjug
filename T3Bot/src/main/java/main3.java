public class main3 {
    public static void main(String[] args) {


        Persona carmelo = new Persona();
        Persona manolete = new Persona();
        Persona zio = new Persona();

        carmelo.name = "Carmelo";
        carmelo.dni = "444444";

        manolete.name = "Manolete";
        manolete.dni = "asdadasdasd";

        if (carmelo == manolete){
            System.out.println("Sí");
        } else {
            System.out.println("No es lo mismo");
        }

        if (manolete.equals(carmelo)){
            System.out.println("Sí");
        } else {
            System.out.println("No es lo mismo");
        }
    }
}


class Persona {
    String name;
    String dni;
}