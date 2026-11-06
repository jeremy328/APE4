public class Ejercicio4 {

    public void incrementar(int n) {
        n = n + 5;
    }

    public static void main(String[] args) {
        Ejercicio4 obj = new Ejercicio4();

        int numero = 10;
        obj.incrementar(numero);

        System.out.println(numero);
    }
}
