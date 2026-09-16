public class Vendedor extends Funcionario {
    private double totalVendidoMes;
    private double percentualComissao;

    public Vendedor(String nome, String cpf, double salario, double totalVendidoMes) {
        this(nome, cpf, salario, totalVendidoMes, 0.05);
    }

    public Vendedor(String nome, String cpf, double salario, double totalVendidoMes, double percentualComissao) {
        super(nome, cpf, salario, "vendedor");
        setTotalVendidoMes(totalVendidoMes);
        setPercentualComissao(percentualComissao);
    }

    public double getTotalVendidoMes() {
        return totalVendidoMes;
    }

    public void setTotalVendidoMes(double totalVendidoMes) {
        if (totalVendidoMes < 0) {
            throw new IllegalArgumentException("O total vendido não pode ser negativo.");
        }
        this.totalVendidoMes = totalVendidoMes;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao < 0 || percentualComissao > 1) {
            throw new IllegalArgumentException("A comissão deve estar entre 0 e 1.");
        }
        this.percentualComissao = percentualComissao;
    }

    public double calcularComissao() {
        return this.totalVendidoMes * this.percentualComissao;
    }

    @Override
    public double calcularBonificacao() {
        return (getSalario() * 0.05) + calcularComissao();
    }
}