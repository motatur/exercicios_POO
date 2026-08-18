public class Cofrinho {
    // Atributos privados
    private String nome;
    private double saldo;
    private double meta;

    // Construtor
    public Cofrinho(String nome, double meta) {
        this.nome = nome;
        this.saldo = 0.0; // O saldo sempre começa em 0
        setMeta(meta);    // Garante validação no momento da criação
    }

    // Getters e Setters permitidos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        if (meta > 0) {
            this.meta = meta;
        } else {
            System.out.println("A meta deve ser um valor positivo!");
        }
    }

   
    public void adicionarDinheiro(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("R$ " + valor + " adicionados com sucesso!");
        } else {
            System.out.println("O valor para depósito deve ser positivo.");
        }
    }

    public void retirarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("O valor de saque deve ser positivo.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar o saque de R$ " + valor + ". Saldo atual: R$ " + this.saldo);
        } else {
            this.saldo -= valor;
            System.out.println("R$ " + valor + " retirados com sucesso!");
        }
    }

   
    public double getProgresso() {
        if (meta <= 0) {
            return 0.0;
        }
        return (saldo / meta) * 100.0;
    }

    
    public String getStatus() {
        if (saldo == 0) {
            return "Meta não iniciada";
        } else if (saldo < meta) {
            return "Economizando";
        } else {
            return "Meta alcançada";
        }
    }
}