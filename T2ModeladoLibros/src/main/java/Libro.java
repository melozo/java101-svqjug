public class Libro {

    String titulo;
    int numeroPaginas;
    String ISBN;
    Boolean abierto = false;
    int edadRecomendada;

    public static boolean abrir(){
        boolean abierto = true;
        return true;
    }

    public static boolean cerrar(){
        return false;
    }

    public static boolean esAptoParapeques(int edadAlumno, int libroEdad){
        if (edadAlumno >= libroEdad){
            return true;
        } else {
            return false;
        }
    }
}
