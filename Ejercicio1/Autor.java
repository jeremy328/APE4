public class Autor {
    String nombre;
    String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
}

class Libro {
    String titulo;
    int anio;
    Autor autor;

    public Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo + ", Año: " + anio + ", Autor: " + autor.nombre + " (" + autor.nacionalidad + ")");
    }
}
