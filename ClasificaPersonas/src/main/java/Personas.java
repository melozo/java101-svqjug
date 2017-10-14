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
        carmelo.ColorDeOjos = "Verdes".toLowerCase();

        // es el objeto mayor de edad?

        if (Verificaciones.edad(carmelo.Edad)){
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
        System.out.println(carmelo.Nombre + " tiene los ojos " + carmelo.ColorDeOjos);
        System.out.println("¿Es raro el color de sus ojos?");
        //Verificaciones.sonRarosTusOjos(carmelo.ColorDeOjos);
        if (Verificaciones.sonRarosTusOjos(carmelo.ColorDeOjos) == "hola"){
            System.out.println("Dice que hola :-¿?");
            /*
            TODO: me gustaría mostrar/saber que viene de la función para poder verificar, si es un string, int, etc..
             */
        } else if (Verificaciones.sonRarosTusOjos(carmelo.ColorDeOjos) == "nada2") {
            System.out.println("No sabemos que vuelve de la función");
        } else {
            System.out.println("No sabemos que vuelve de la función");
        }
        // llamamos a la función pasando un argumento
        // ver si podemos devolvernos  Strings
        if (Verificaciones.sonRarosTusOjos(carmelo.ColorDeOjos) == "raros") {
            System.out.println("ei, pasa algo");
        } else if (Verificaciones.sonRarosTusOjos(carmelo.ColorDeOjos) == "normales") {
            System.out.println("normales... del monton");
        } else {
            System.out.println("No hay match entre las cadenas");
        }
    }
}
