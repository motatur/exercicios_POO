import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite apenas números.");
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner);
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    exibirTotalFolha();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU DA FOLHA DE PAGAMENTO ===");
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Listar funcionários");
        System.out.println("3 - Total da folha");
        System.out.println("0 - Sair");
    }

    private static void cadastrarFuncionario(Scanner scanner) {
        try {
            String cargo = lerCargo(scanner);
            String nome = lerNome(scanner);
            String cpf = lerCpf(scanner);
            double salario = lerSalario(scanner);

            Funcionario funcionario;

            switch (cargo) {
                case "gerente":
                    funcionario = new Gerente(nome, cpf, salario);
                    break;
                case "desenvolvedor":
                    funcionario = new Desenvolvedor(nome, cpf, salario);
                    break;
                case "vendedor":
                    double totalVendidoMes = lerValorPositivo(scanner, "Total vendido no mês: ");
                    funcionario = new Vendedor(nome, cpf, salario, totalVendidoMes);
                    break;
                default:
                    throw new IllegalArgumentException("Cargo inválido.");
            }

            funcionarios.add(funcionario);
            System.out.println("\nCadastro realizado com sucesso!");
            System.out.printf("Bonificação calculada: R$ %.2f%n", funcionario.calcularBonificacao());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }

    private static String lerCargo(Scanner scanner) {
        while (true) {
            System.out.print("Cargo (gerente / desenvolvedor / vendedor): ");
            String cargo = scanner.nextLine().trim().toLowerCase();

            if (cargo.equals("gerente") || cargo.equals("desenvolvedor") || cargo.equals("vendedor")) {
                return cargo;
            }
            System.out.println("Cargo inválido. Digite apenas: gerente, desenvolvedor ou vendedor.");
        }
    }

    private static String lerNome(Scanner scanner) {
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine().trim();

            // Valida se não está vazio e se não contém números
            if (nome.isEmpty()) {
                System.out.println("O nome não pode estar vazio.");
            } else if (!nome.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
                System.out.println("Nome inválido. Digite apenas letras sem números.");
            } else if (nome.length() < 2) {
                System.out.println("O nome deve ter no mínimo 2 caracteres.");
            } else {
                return nome;
            }
        }
    }

    private static String lerCpf(Scanner scanner) {
        while (true) {
            System.out.print("CPF (somente números): ");
            String cpf = scanner.nextLine().trim();

            if (cpf.isEmpty()) {
                System.out.println("O CPF não pode estar vazio.");
            } else if (!cpf.matches("\\d+")) {
                System.out.println("CPF inválido. Digite apenas números.");
            } else if (cpf.length() != 11) {
                System.out.println("CPF inválido. O CPF deve conter exatamente 11 dígitos.");
            } else {
                return cpf;
            }
        }
    }

    private static double lerSalario(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Salário: R$ ");
                double salario = Double.parseDouble(scanner.nextLine().replace(",", "."));

                if (salario <= 0) {
                    System.out.println("O salário deve ser maior que zero.");
                    continue;
                }
                return salario;
            } catch (NumberFormatException e) {
                System.out.println("Salário inválido. Digite apenas valores numéricos.");
            }
        }
    }

    private static double lerValorPositivo(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = Double.parseDouble(scanner.nextLine().replace(",", "."));

                if (valor < 0) {
                    System.out.println("O valor não pode ser negativo.");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite apenas números.");
            }
        }
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirHolerite();
        }
    }

    private static void exibirTotalFolha() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado para calcular a folha.");
            return;
        }

        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularRemuneracaoTotal();
        }
        System.out.printf("%nTotal da folha: R$ %.2f%n", total);
    }
}