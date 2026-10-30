package APE.Ejercicio5;

public class Usuario {
    String nombre;
    String cedula;

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}

class Libro {
    String titulo;
    boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponible = true;
    }
}

class Prestamo {
    Usuario usuario;
    Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Prestamo exitoso: " + usuario.nombre + " tomo el libro '" + libro.titulo + "'");
        } else {
            System.out.println("No se pudo prestar: El libro '" + libro.titulo + "' no esta disponible para " + usuario.nombre);
        }
    }
}
