# Módulo: Conta Bancária (Herança e Polimorfismo)

Projeto focado em aplicar a reutilização de código e a especialização de classes por meio do conceito de Herança em Java.

##  Estrutura das Classes (src/)

* **ContaBancaria.java:** Classe base que contém os dados comuns de uma conta (número, titular, saldo) e operações genéricas como depósito e saque.
* **ContaCorrente.java:** Subclasse que herda de `ContaBancaria`, adicionando regras específicas como taxas de operação ou limite de cheque especial.
* **ContaPoupanca.java:** Subclasse que herda de `ContaBancaria`, adicionando lógica para rendimento periódico.
* **ContaEmpresarial.java:** Subclasse voltada para contas de pessoas jurídicas, com permissão para empréstimos ou limites diferenciados.
* **Main.java:** Classe principal para simulação de transações bancárias e testes do polimorfismo.

## 🎯 Conceitos Aplicados
* **Herança:** Reaproveitamento de código da classe pai `ContaBancaria`.
* **Sobrescrita de Métodos (`@Override`):** Customização de saques e taxas de acordo com o tipo da conta.
* **Encapsulamento:** Proteção do saldo e atributos sensíveis contra alterações indevidas.