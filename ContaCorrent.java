public class ContaCorrent {

    private double saldo;
    private double limiteDeSaque = 500;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado de: " + valor);
        } else {
            System.out.println("Depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= limiteDeSaque && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado de : " + valor);
        } else {
            System.out.println("Saldo ou limite de saque insuficiente.");
        }
    }
    public void exibirSaldo(double valor) {
        System.out.println("Saldo: " + saldo);

    }
}
