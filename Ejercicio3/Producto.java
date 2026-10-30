package APE.Ejerecicio3;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}

class Venta {
    int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aplicar(Producto producto) {
        if (cantidad <= producto.stock) {
            producto.reducirStock(cantidad);
            double total = cantidad * producto.precio;
            System.out.println("Venta aplicada: " + cantidad + " x " + producto.nombre);
            System.out.println("Total a pagar: $" + total);
            producto.mostrarProducto();
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}
