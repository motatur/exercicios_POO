import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        // 1. Instanciação dos Funcionários Válidos
        funcionarios.add(new Gerente("Mariana Souza", "111.222.333-44", 10000.00));
        funcionarios.add(new Desenvolvedor("Carlos Lima", "555.666.777-88", 7000.00));
        funcionarios.add(new Vendedor("Ana Costa", "999.888.777-66", 4000.00, 50000.00, 0.03));

        // 2. Exibição do Holerite e Cálculo do Total da Folha
        double totalFolha = 0;
        for (Funcionario f : funcionarios) {
            f.exibirHolerite();
            totalFolha += f.calcularRemuneracaoTotal();
        }

        System.out.println("-");
        System.out.printf("Total da folha: R$ %.2f\n\n", totalFolha);

        // 3. Testes Obrigatórios de Validação 
        System.out.println("= TESTES DE VALIDAÇÃO DE ERROS =");
        
        testarCriacao("Nome Vazio", () -> new Gerente("", "123", 5000));
        testarCriacao("CPF Vazio", () -> new Desenvolvedor("João", "", 5000));
        testarCriacao("Salário Zero/Negativo", () -> new Vendedor("Pedro", "123", 0, 1000, 0.01));
    }

    private static void testarCriacao(String cenario, Runnable teste) {
        try {
            teste.run();
            System.out.println("Falha no teste [" + cenario + "]: Nenhuma exceção foi lançada.");
        } catch (IllegalArgumentException e) {
            System.out.println("Sucesso no teste [" + cenario + "]: " + e.getMessage());
        }
    }
}