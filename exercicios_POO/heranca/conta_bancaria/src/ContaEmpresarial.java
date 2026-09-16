public class ContaEmpresarial extends ContaBancaria {

    private double limite;
    private final double taxaSaque = 5.00;

    public ContaEmpresarial(String titular, String numeroConta, double limite) {
        super(titular, numeroConta);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }

        double valorTotal = valor + taxaSaque;

        if (valorTotal <= getSaldo() + limite) {
            debitar(valorTotal);

            System.out.println("Taxa de saque: R$ " + taxaSaque);
            System.out.println("Saque realizado com sucesso!");

            return true;
        }

        System.out.println("Saque recusado. Saldo + limite insuficientes.");
        return false;
    }
}