public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario, "desenvolvedor");
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.10;
    }
}