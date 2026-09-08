public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, String numeroConta) {
        super(titular, numeroConta);
    }

    @Override
    public boolean sacar(double valor) {
        // 1. valor <= 0 → inválido, retorna false
        // 2. valor > getSaldo() → saldo insuficiente, retorna false
        // 3. senão, chama debitar(valor) e retorna true
        return false; // placeholder
    }
}