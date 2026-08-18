public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Guerreiro");

        System.out.println("= STATUS INICIAL =");
        System.out.println("Nome: " + heroi.getNome());
        System.out.println("Nível: " + heroi.getNivel());
        System.out.println("Vida: " + heroi.getVida());
        System.out.println("Energia: " + heroi.getEnergia());
        System.out.println("Status: " + heroi.getStatus());

        System.out.println(" Realizando Ataques ");
        heroi.atacar(40); 
        heroi.atacar(50);
        heroi.atacar(20); 
        System.out.println("\n--- Descansando ---");
        heroi.descansar(50); 

        System.out.println("\n--- Recebendo Dano ---");
        heroi.receberDano(60);  
        System.out.println("Status: " + heroi.getStatus()); // Vivo

        heroi.receberDano(50);  // Vida vai para 0 
        System.out.println("Status: " + heroi.getStatus()); // Derrotado

        System.out.println("\n--- Tentando ações após a derrota ---");
        heroi.atacar(10);
        heroi.descansar(20);
    }
}