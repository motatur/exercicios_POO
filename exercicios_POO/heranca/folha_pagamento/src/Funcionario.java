public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String cpf, double salario, String cargo) {
        validarNome(nome);
        validarCpf(cpf);
        validarSalario(salario);
        validarCargo(cargo);

        this.nome = nome.trim();
        this.cpf = formatarCpf(cpf);
        this.salario = salario;
        this.cargo = cargo.trim();
    }

    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty() || !nome.trim().matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
            throw new IllegalArgumentException("Nome inválido. Não pode ser vazio ou conter números.");
        }
    }

    private void validarSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("O salário deve ser maior que zero.");
        }
    }

    private void validarCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty() || !cpf.trim().matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido. Deve possuir exatamente 11 dígitos numéricos.");
        }
    }

    private void validarCargo(String cargo) {
        if (cargo == null || cargo.trim().isEmpty()) {
            throw new IllegalArgumentException("O cargo não pode estar vazio.");
        }
    }

    private String formatarCpf(String cpf) {
        String cpfLimpo = cpf.replaceAll("\\D", "");
        return cpfLimpo.substring(0, 3) + "." + cpfLimpo.substring(3, 6) + "." +
               cpfLimpo.substring(6, 9) + "-" + cpfLimpo.substring(9, 11);
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getSalario() { return salario; }
    public String getCargo() { return cargo; }

    public double calcularRemuneracaoTotal() {
        return this.salario + calcularBonificacao();
    }

    public abstract double calcularBonificacao();

    public void exibirHolerite() {
        System.out.println("-------------------------------------");
        System.out.println("Cargo: " + cargo);
        System.out.println("Funcionário: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Bonificação: R$ %.2f%n", calcularBonificacao());
        System.out.printf("Remuneração total: R$ %.2f%n", calcularRemuneracaoTotal());
        System.out.println("----------------------------------------");
    }
}