public class Bienvenida {

    public void mostrarBienvenida(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad
                + " años. ¡Bienvenido al sistema!");
    }

    public static void main(String[] args) {
        Bienvenida usuario = new Bienvenida();
        usuario.mostrarBienvenida("Jeremy", 19);
    }
}
