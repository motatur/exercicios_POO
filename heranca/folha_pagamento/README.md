# Sistema de Folha de Pagamento - TechSolutions

## Objetivo
Automação do cálculo da folha de pagamento e bonificações de funcionários.

## Regras de Bonificação
- **Gerente:** 20% sobre o salário base.
- **Desenvolvedor:** 10% sobre o salário base.
- **Vendedor:** 5% sobre o salário base + comissão das vendas.

## Conceitos de POO Aplicados
- **Encapsulamento:** Atributos privados com getters/setters contendo regras de validação.
- **Herança:** Gerente, Desenvolvedor e Vendedor herdam atributos e métodos comuns de Funcionario.
- **Abstração:** Classe `Funcionario` como abstrata e contrato do método `calcularBonificacao()`.
- **Polimorfismo:** Lista genérica `ArrayList<Funcionario>` processando diferentes cálculos de forma unificada.

