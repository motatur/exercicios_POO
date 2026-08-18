public class Main {
    public static void main(String[] args) {
        Pet meuPet = new Pet("Tamagotchi");

        
        meuPet.setFome(-500); 
        meuPet.setEnergia(90);

        System.out.println("Nome: " + meuPet.getNome());
        System.out.println("Fome: " + meuPet.getFome()); 
        System.out.println("Humor: " + meuPet.getHumor()); 
    }
}