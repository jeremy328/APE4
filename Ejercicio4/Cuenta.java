package APE.Ejercicio4;

public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public void transferir(Cuenta destino, double monto) {
        if (this.retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto + " de " + this.titular + " a " + destino.titular);
        } else {
            System.out.println("Fondos insuficientes para transferir $" + monto + " desde " + this.titular);
        }
    }

    public void mostrar() {
        System.out.println("Cuenta de " + titular + " - Saldo: $" + saldo);
    }
}
