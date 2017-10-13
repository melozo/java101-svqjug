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
        if (edad > 18){
            return true;
        } else {
            return false;
        }
    }

    // altura
    static boolean altura(float f){
        if (f >= 1.65 ){
            return true;
        } else {
            return false;
        }
    }

    // indice de grasa!, juas
    // esto es una mierda y mentira
    static boolean grasa(float altura, float peso){
        float calculoGrasaCorporal = altura * peso;
        if ( (peso % altura) > calculoGrasaCorporal ){
            return true;
        } else {
            return false;
        }
    }

    // ojos rarunos
    // tema 3 arrays

    /*
    static String colorDeOjos(String color){

    }
    */

}
