public class Main {
    public static void main(String[] args) {
        // Criando um cofrinho com nome "Viagem" e meta de R$ 500
        Cofrinho meuCofre = new Cofrinho("Viagem de Férias", 500.0);

        System.out.println("= ESTADO INICIAL =");
        System.out.println("Cofre: " + meuCofre.getNome());
        System.out.println("Saldo: R$ " + meuCofre.getSaldo());
        System.out.println("Progresso: " + meuCofre.getProgresso() + "%");
        System.out.println("Status: " + meuCofre.getStatus());

        System.out.println(" Adicionando R$ 250 ");
        meuCofre.adicionarDinheiro(250.0);
        System.out.println("Progresso: " + meuCofre.getProgresso() + "%");
        System.out.println("Status: " + meuCofre.getStatus());

        System.out.println(" Tentando retirar R$ 400 (Inválido)");
        meuCofre.retirarDinheiro(400.0);

        System.out.println(" Adicionando mais R$ 300 ");
        meuCofre.adicionarDinheiro(300.0);
        System.out.println("Saldo atual: R$ " + meuCofre.getSaldo());
        System.out.println("Progresso: " + meuCofre.getProgresso() + "%");
        System.out.println("Status: " + meuCofre.getStatus());
    }
}