public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, String numeroConta) {
        super(titular, numeroConta);
    }

    @Override
    public boolean sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }

        if (valor <= getSaldo()) {
            debitar(valor);
            System.out.println("Saque realizado com sucesso!");
            return true;
        }

        System.out.println("Saldo insuficiente.");
        return false;
    }
}