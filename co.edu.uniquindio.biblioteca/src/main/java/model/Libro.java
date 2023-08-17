package model;

public class Libro {

    private  string nombre;
    private  string genero;
    private  string autor;
    private  string anioPublicacion;
    private  string editorial;
    private  string numeroPaginas;

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getGenero() {
        return genero;
    }

    public void setGenero(string genero) {
        this.genero = genero;
    }

    public string getAutor() {
        return autor;
    }

    public void setAutor(string autor) {
        this.autor = autor;
    }

    public string getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(string anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public string getEditorial() {
        return editorial;
    }

    public void setEditorial(string editorial) {
        this.editorial = editorial;
    }

    public string getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(string numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
