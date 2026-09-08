public class ContaEmpresarial extends ContaBancaria {

    private double limite;
    private static final double TAXA_SAQUE = 5.00;

    public ContaEmpresarial(String titular, String numeroConta, double limite) {
        super(titular, numeroConta);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        // 1. valor <= 0 → inválido, retorna false
        // 2. valor + TAXA_SAQUE > (getSaldo() + this.limite) → recusa, retorna false
        // 3. senão, chama debitar(valor + TAXA_SAQUE) e retorna true
        // dica: imprima também a mensagem "Taxa de saque: R$ 5,00" antes de debitar
        return false; // placeholder
    }
}