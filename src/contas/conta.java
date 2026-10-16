public abstract class conta {
    protected double saldo;
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public abstract void sacar(double valor);
}