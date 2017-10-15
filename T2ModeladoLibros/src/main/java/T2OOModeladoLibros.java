public class T2OOModeladoLibros {
    public static void main(String[] args) {

        Alumno pepe = new Alumno();
        System.out.println("Objeto instanciado");
        Libro libro1 = new Libro();
        System.out.println("Objeto instanciado");

        libro1.titulo = "12 monos";
        libro1.edadRecomendada = 10;
        libro1.numeroPaginas = 1000;
        libro1.abierto = false;
        pepe.edad = 5;

        if (Libro.esAptoParapeques(pepe.edad, libro1.edadRecomendada)){
            System.out.println("El libro " + libro1.titulo + " es recomendable" );
            System.out.println("Puedes abrir el libro. Debug->" + libro1.abrir());
//            if (libro1.abierto == true){ // esto no funciona
//                System.out.println("Bien!, ya tienes abierto el libro... comienza la lectura");
        } else {
            System.out.println("El libro " + libro1.titulo + " no es recomendable para peques");
        }
    }
}
