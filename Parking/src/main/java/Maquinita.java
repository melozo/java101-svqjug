import java.util.List;

public class Maquinita {

    /*
        Maquinita de entrada
         1. hace foto
         2. extrae la matricula List<String> para la simulación
         3. envia matricula y hora de entrada

         Debemos simular que entra un nuevo coche, con lo que vamos a dotar a nuestra maquinita
         de un sensor, esto lo representaremos como una petición por consola input

         Preguntará por consola ¿ Existe un nuevo vehiculo ?, Si le decimos que sí, empezará la mandanga

         Nota:
         Nueva feature: clase sensor que se dispare: true si detecta vehículo
     */

//    List<String> matriculas;
    String matricula = "SE778877EF";


//    boolean cocheEnLaPuerta = false;

    public boolean isCocheEnLaPuerta(){
        return true;
    }

    public String getMatricula(){
        return matricula;
    }


}
