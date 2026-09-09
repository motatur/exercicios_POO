public class Vendedor extends Funcionario {
    private double totalVendidoMes;
    private double percentualComissao; 

    public Vendedor(String nome, String cpf, double salario, double totalVendidoMes, double percentualComissao) {
        super(nome, cpf, salario);
        setTotalVendidoMes(totalVendidoMes);
        this.percentualComissao = percentualComissao;
    }

    public double getTotalVendidoMes() { return totalVendidoMes; }
    public void setTotalVendidoMes(double totalVendidoMes) {
        if (totalVendidoMes < 0) {
            throw new IllegalArgumentException("O total vendido não pode ser negativo.");
        }
        this.totalVendidoMes = totalVendidoMes;
    }

    public double calcularComissao() {
        return this.totalVendidoMes * this.percentualComissao;
    }

    @Override
    public double calcularBonificacao() {
        return (getSalario() * 0.05) + calcularComissao();
    }
}