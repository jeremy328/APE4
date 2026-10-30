package APE.Ejerecicio3;

public class main3 {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 800.0, 10);
        p1.mostrarProducto();

        Venta v1 = new Venta(2);
        v1.aplicar(p1);

        Venta v2 = new Venta(20);
        v2.aplicar(p1);
    }
}
