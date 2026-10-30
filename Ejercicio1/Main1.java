public class Main1 {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("Jorge Luis Borges", "Argentina");

        Libro l1 = new Libro("Cien Años de Soledad", 1967, a1);
        Libro l2 = new Libro("Ficciones", 1944, a2);

        l1.mostrarInformacion();
        l2.mostrarInformacion();
    }
}
