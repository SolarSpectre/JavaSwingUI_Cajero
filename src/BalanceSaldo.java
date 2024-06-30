public class BalanceSaldo {
    private static int saldo = 200;

    public static int getSaldo() {
        return saldo;
    }

    public static void depositar(int valor) {
        saldo += valor;
    }
    public static void retirar(int valor) {
        saldo -= valor;
    }
}
