package Ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("Arroz", 2.00, 6),
            new Producto("Leche", 1.25, 4),
            new Producto("Aceite", 3.50, 10),
            new Producto("Jabon", 1.00, 8)
        };

        // Venta de 3 unidades de dos productos
        productos[0].stock -= 3;
        productos[2].stock -= 3;

        double total = 0;

        for (Producto p : productos) {
            System.out.printf("%s : $%.2f", p.nombre, p.precio);

            if (p.stock < 5) {
                System.out.print(" - Reponer");
            }

            System.out.println(" | Stock: " + p.stock);
            total += p.precio * p.stock;
        }

        System.out.printf("Valor total del inventario: $%.2f%n", total);
    }
}
