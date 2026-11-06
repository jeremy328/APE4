public class Producto {
    String nombre;
    int stock;
    double precioUnitario;

    public double calcularValorTotal() {
        return stock * precioUnitario;
    }
}
