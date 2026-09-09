public abstract class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

     public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

        public double getSaldo(){
            return this.saldo;

        }

        public void depositar (double valor){
            if(valor > 0) {
                this.saldo += valor;
                    System.out.println("Depósito de R$" + valor + "Realizado!");
            }else{
            System.out.println("O valor de depósito é invalido.");
        }
    }
        protected void debitar(double valor){
            this.saldo -= valor;
        }    
        public abstract boolean sacar(double valor);
           
        public void exibirExtrato() {
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo atual: R$ " + this.saldo);
    }
}
    


    
