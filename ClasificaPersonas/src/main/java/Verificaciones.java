public class Verificaciones {
    /*
    Verificaciones:
    1. edad y retorna bool (true si edad > 18)
    2. altura retorna bool (true si altura es mayor a la media 1.65)
    3. indice de grasa corporal (altura * peso)
    4. Dada una lista de color de ojos atípicos verifica el dato y alerta si esta entre los "raros"
     */

    // edad
    static boolean edad(int edad) {
        if (edad > 18) {
            return true;
        } else {
            return false;
        }
    }

    // altura
    static boolean altura(float f) {
        if (f >= 1.65) {
            return true;
        } else {
            return false;
        }
    }

    // indice de grasa!, juas
    // esto es una mierda y mentira
    static boolean grasa(float altura, float peso) {
        float calculoGrasaCorporal = altura * peso;
        if ((peso % altura) > calculoGrasaCorporal) {
            return true;
        } else {
            return false;
        }
    }

    /*
     Dados una lista (array, arreglo, vector, blaublau...) de  ojos rarunos coteja con los ojos de la
     persona para determinar si son "raros"

     tema 3 arrays
     refs:
     https://stackoverflow.com/questions/8719012/using-an-array-in-a-do-while-statement
     https://es.stackoverflow.com/questions/62695/recorrer-arreglo-java-eficientemente
    */
    static String sonRarosTusOjos(String colorDeOjos) {

        String[] listaOjosRaros = new String[5];
        listaOjosRaros[0] = "rojos";
        listaOjosRaros[1] = "morados";
        listaOjosRaros[2] = "blancos";
        listaOjosRaros[3] = "blau";
        listaOjosRaros[4] = "amarillos";


        for (String color : listaOjosRaros) {
            if (listaOjosRaros.equals(colorDeOjos)) {
//                System.out.println("Tus ojos son raretes :-)");
                return "raros";
            } else {
                return "normales";
            }
        }

        return "nada2";
        /*
        for ( colorDeOjos : listaOjosRaros ){
            if ( colorDeOjos == listaOjosRaros[]){
                resultado = "";
                return resultado;
            }
        }
        */
    }
}