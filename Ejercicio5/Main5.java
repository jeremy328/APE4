package APE.Ejercicio5;

public class Main5 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Don Quijote");
        Usuario u1 = new Usuario("Carlos", "1801234567");
        Usuario u2 = new Usuario("Ana", "1807654321");

        Prestamo p1 = new Prestamo(u1, libro1);
        Prestamo p2 = new Prestamo(u2, libro1);

        p1.registrar(); // Debe funcionar
        p2.registrar(); // Debe fallar - mismo libro
    }
}
