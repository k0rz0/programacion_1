package co.edu.uniquindio.biblioteca;

import model.Libro;

public class Main {
    public static void main(String[] args) {

        Libro libro0 = new Libro();
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();


        String cadena ="Hola a todos ";
        double dato=5;
        cadena +=cadena.valueOf(dato);
        System.out.println("el dato es "+cadena);

        crearLibros(libro0, libro1, libro2, libro3, libro4);

        cambiarNombre(libro0, libro1, libro2, libro3, libro4);

        valiadarPrimerLetra(libro0, libro1, libro2, libro3, libro4);

        contadorTerror(libro0, libro1, libro2, libro3, libro4);

        numeropaginas(libro0, libro1, libro2, libro3, libro4);

        libroConMasPaginas(libro0, libro1, libro2, libro3, libro4);
    }

    private static void crearLibros(Libro libro0, Libro libro1, Libro libro2, Libro libro3, Libro libro4) {

        //    Creation first book
        libro0.setNombre("Cálculo integral");
        libro0.setGenero("Calculo");
        libro0.setAutor("hon K.");
        libro0.setAnioPublicacion("1997");
        libro0.setEditorial("New Wolrd");
        libro0.setNumeroPaginas("758");

        //    Creation second book
        libro1.setNombre("Socorro");
        libro1.setGenero("Drama");
        libro1.setAutor("Sarah M.");
        libro1.setAnioPublicacion("2000");
        libro1.setEditorial("Casttle Up");
        libro1.setNumeroPaginas("1250");

        //  Creation third book
        libro2.setNombre("El filo del alma");
        libro2.setGenero("Novela");
        libro2.setAutor("Stanis P..");
        libro2.setAnioPublicacion("2010");
        libro2.setEditorial("Paramount");
        libro2.setNumeroPaginas("3000");

        //  Creation third book
        libro3.setNombre("El más allá");
        libro3.setGenero("Terror");
        libro3.setAutor("Teresa W.");
        libro3.setAnioPublicacion("1954");
        libro3.setEditorial("Start Sub");
        libro3.setNumeroPaginas("459");

        //  Creation third book
        libro4.setNombre("Buscando a Pepe");
        libro4.setGenero("Cuento");
        libro4.setAutor("isaac K.");
        libro4.setAnioPublicacion("2015");
        libro4.setEditorial("Souht Switch");
        libro4.setNumeroPaginas("48");

    }

    private static void valiadarPrimerLetra(Libro libro0, Libro libro1, Libro libro2, Libro libro3, Libro libro4) {

        char letra;
        int vocal = 0;
        int consonante = 0;

        letra = libro0.getNombre().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            vocal++;
        }else{
            consonante++;
        }

        letra = libro1.getNombre().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            vocal++;
        }else{
            consonante++;
        }

        letra = libro2.getNombre().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            vocal++;
        }else{
            consonante++;
        }

        letra = libro3.getNombre().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            vocal++;
        }else{
            consonante++;
        }

        letra = libro4.getNombre().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            vocal++;
        }else{
            consonante++;
        }

        System.out.println("--------------------------------");

        System.out.println("Libros que inician por vocal: "+ vocal + "\nLibros que inician por consonante: " + consonante);

    }

    private static void cambiarNombre(Libro libro0, Libro libro1, Libro libro2, Libro libro3, Libro libro4) {

        String nombreBusqueda = "Cálculo integral";
        String nombreCambiar = "Cálculo integral y diferencial";

        if (libro0.getNombre().equals(nombreBusqueda)) {
            libro0.setNombre(nombreCambiar);
        }

        if (libro1.getNombre().equals(nombreBusqueda)) {
            libro1.setNombre(nombreCambiar);
        }

        if (libro2.getNombre().equals(nombreBusqueda)) {
            libro2.setNombre(nombreCambiar);
        }

        if (libro3.getNombre().equals(nombreBusqueda)) {
            libro3.setNombre(nombreCambiar);
        }

        if (libro4.getNombre().equals(nombreBusqueda)) {
            libro4.setNombre(nombreCambiar);
        }

        System.out.println("--------------------------------");

        System.out.println(libro0.getNombre());
        System.out.println(libro1.getNombre());
        System.out.println(libro2.getNombre());
        System.out.println(libro3.getNombre());
        System.out.println(libro4.getNombre());

    }

    public static void contadorTerror(Libro libro0, Libro libro1, Libro libro2, Libro libro3, Libro libro4) {

        int contador = 0;
        String genero = "Terror";

        if (libro0.getGenero().equals(genero)) {
            contador++;
        }

        if (libro1.getGenero().equals(genero)) {
            contador++;
        }

        if (libro2.getGenero().equals(genero)) {
            contador++;
        }

        if (libro3.getGenero().equals(genero)) {
            contador++;
        }

        if (libro4.getGenero().equals(genero)) {
            contador++;
        }

        System.out.println("--------------------------------");

        System.out.println("Cantidad de libros de genero 'Terror': " + contador);
    }

    private static void numeropaginas(Libro libro0, Libro libro1, Libro libro2, Libro libro3, Libro libro4) {

//        Mostrar el número de páginas de los libros
        System.out.println("--------------------------------");

        System.out.println(libro0.getNumeroPaginas());
        System.out.println(libro1.getNumeroPaginas());
        System.out.println(libro2.getNumeroPaginas());
        System.out.println(libro3.getNumeroPaginas());
        System.out.println(libro4.getNumeroPaginas());

    }


    private static void libroConMasPaginas(Libro libro0, Libro libro1, Libro libro2, Libro libro3, Libro libro4) {

        int mayor = Math.max(Integer.parseInt(libro0.getNumeroPaginas()), Integer.parseInt(libro1.getNumeroPaginas()));

        mayor = Math.max(Integer.parseInt(libro2.getNumeroPaginas()), mayor);

        mayor = Math.max(Integer.parseInt(libro3.getNumeroPaginas()), mayor);

        mayor = Math.max(Integer.parseInt(libro4.getNumeroPaginas()), mayor);

        System.out.println("--------------------------------");

        System.out.println("El libro más extenso tiene " + mayor + " páginas");

    }

}

