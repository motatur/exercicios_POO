public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        }
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("O CPF não pode estar vazio.");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("O salario não pode ser 0.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario; 
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;

        public abstract double calcularBonificacao();
    }
}
