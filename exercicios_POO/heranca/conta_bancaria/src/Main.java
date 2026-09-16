public class Main {

    public static void main(String[] args) {

        // Criando as contas
        ContaPoupanca poupanca =
                new ContaPoupanca("João", "0001-1");

        ContaCorrente corrente =
                new ContaCorrente("Maria", "0001-2", 1000.00);

        ContaEmpresarial empresarial =
                new ContaEmpresarial("Loja Central Ltda.", "0001-9", 5000.00);


       

        System.out.println("= CONTA POUPANÇA =");

        poupanca.depositar(1000);

        System.out.println("Saldo: R$ " + poupanca.getSaldo());

        poupanca.sacar(300);

        System.out.println("Saldo: R$ " + poupanca.getSaldo());

        // Tentativa de sacar acima do saldo
        poupanca.sacar(1000);

        System.out.println("Saldo: R$ " + poupanca.getSaldo());


       

        System.out.println("\n= CONTA CORRENTE =");

        corrente.depositar(1000);

        System.out.println("Saldo: R$ " + corrente.getSaldo());

        // Saque usando parte do saldo
        corrente.sacar(500);

        System.out.println("Saldo: R$ " + corrente.getSaldo());

        // Saque utilizando o limite
        corrente.sacar(1200);

        System.out.println("Saldo: R$ " + corrente.getSaldo());

        // Saque acima do saldo + limite
        corrente.sacar(1000);

        System.out.println("Saldo: R$ " + corrente.getSaldo());


       

        System.out.println("\n= CONTA EMPRESARIAL =");

        empresarial.depositar(2000);

        System.out.println("Saldo: R$ " + empresarial.getSaldo());

       
        empresarial.sacar(2500);

        System.out.println("Saldo: R$ " + empresarial.getSaldo());


        

        System.out.println("\n= TESTES DE DEPÓSITO =");

        poupanca.depositar(0);

        poupanca.depositar(-100);


     

        System.out.println("\n= TESTE DE SAQUE NEGATIVO =");

        poupanca.sacar(-50);


        

        System.out.println("\n== EXTRATOS =");

        poupanca.exibirExtrato();

        System.out.println();

        corrente.exibirExtrato();

        System.out.println();

        empresarial.exibirExtrato();
    }
}