class Personas {

    /*
    Variables:
    Nombre
    Edad
    Peso
    Altura
    Color de ojos
     */

    String Nombre;
    int Edad;
    float Peso;
    float Altura;
    String ColorDeOjos;

    public static void main(String[] args) {
        Personas carmelo = new Personas();
        Personas pepa = new Personas();
        Personas pepapi = new Personas();

        carmelo.Nombre = "Carmelo";
        carmelo.Edad = 35;
        carmelo.Peso = 78;
        carmelo.Altura = (float) 1.95; // ja!
        carmelo.ColorDeOjos = "Verdes";

        // es el objeto mayor de edad?

        if (Verificaciones.edad(carmelo.Edad) == true){
            System.out.println("Es mayorcete!");
        } else {
            System.out.println("Ja!, no se lo cree ni el");
        }

        // tiene el objeto sobrepeso?
        boolean resultado = Verificaciones.grasa(carmelo.Altura, carmelo.Peso);
        // verificacion true
        if (resultado){
            System.out.println("Deja de comer mantecaos");
        } else {
            System.out.println("Tomate otra birra!");
        }

        // son raretes los ojos del objeto?
        // tema 3 arrays

    }
}
