public class ContaCorrente extends ContaBancaria {

    private double limite;

    public ContaCorrente(String titular, String numeroConta, double limite) {
        super(titular, numeroConta);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        // 1. valor <= 0 → inválido, retorna false
        // 2. valor > (getSaldo() + this.limite) → recusa, retorna false
        // 3. senão, chama debitar(valor) e retorna true
        return false; // placeholder
    }
}