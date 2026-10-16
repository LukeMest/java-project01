public class Main {
    public static void main(String[] args) {
        conta c1 = new ContaCorrente();
        c1.depositar(100.0);
        c1.sacar(20.0);
        System.out.println("Saldo da conta corrente: R$ " + c1.saldo);

        conta c2 = new ContaPoupanca();
         c2.depositar(100.0);
         c2.sacar(20.0);
         System.out.println("Saldo da conta poupança: R$ " + c2.saldo);
    }
}