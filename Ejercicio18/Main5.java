package Ejercicio5;

public class Main5 {
    public static void main(String[] args) {
        Libro[] libros = {
            new Libro("Java", "Gosling"),
            new Libro("C++", "Stroustrup"),
            new Libro("Python", "Rossum"),
            new Libro("POO", "Booch")
        };

        Socio s1 = new Socio("Ana");
        Socio s2 = new Socio("Luis");


        libros[0].disponible = false;
        libros[1].disponible = false;
        s1.librosPrestados += 2;

        libros[2].disponible = false;
        s2.librosPrestados++;

        System.out.println("Estado de los libros:");

        int disponibles = 0;

        for (Libro l : libros) {
            if (l.disponible) {
                System.out.println(l.titulo + " : Disponible");
                disponibles++;
            } else {
                System.out.println(l.titulo + " : Prestado");
            }
        }

        System.out.println("\nSocios:");

        System.out.println(s1.nombre + " : "
                + s1.librosPrestados);
        System.out.println(s2.nombre + " : "
                + s2.librosPrestados);

        System.out.println("Libros disponibles: " + disponibles);
    }
}
