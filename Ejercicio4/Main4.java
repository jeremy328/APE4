package APE.Ejercicio4;

public class Main4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Juan", 1000);
        Cuenta c2 = new Cuenta("Maria", 500);

        c1.mostrar();
        c2.mostrar();

        System.out.println("\n--- Transferencia valida ---");
        c1.transferir(c2, 300);

        System.out.println("\n--- Transferencia que falla ---");
        c1.transferir(c2, 2000);

        System.out.println("\n--- Saldos finales ---");
        c1.mostrar();
        c2.mostrar();
    }
}
