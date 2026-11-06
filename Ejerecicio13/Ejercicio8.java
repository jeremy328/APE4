public class Ejercicio8 {
    public static void main(String[] args) {
        // a. Instanciar un objeto de la clase Producto llamado p
        Producto p = new Producto();

        // b. Asignarle un stock = 10 y un precioUnitario = 25.5
        p.setStock(10);
        p.setPrecioUnitario(25.5);

        // c. Llamar al método calcularValorTotal(), guardar el resultado y mostrarlo
        double totalInventario = p.calcularValorTotal();
        System.out.println("El valor total del inventario es: " + totalInventario);
    }
}
