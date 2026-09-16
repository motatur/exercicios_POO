public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario, "gerente");
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.20;
    }
}