public class ContaCorrente extends ContaBancaria {

    private double limite;

    public ContaCorrente(String titular, String numeroConta, double limite) {
        super(titular, numeroConta);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }

        if (valor <= getSaldo() + limite) {
            debitar(valor);
            System.out.println("Saque realizado com sucesso!");
            return true;
        }

        System.out.println("Saque recusado. Saldo + limite insuficientes.");
        return false;
    }
}