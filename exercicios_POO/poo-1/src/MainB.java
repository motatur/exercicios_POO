import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu bichinho virtual: ");
        String nome = scanner.nextLine();

        BichinhoVirtual pet = new BichinhoVirtual(nome);

        int opcao = 0;
        while (opcao != 5) {

            System.out.println("  PET: " + pet.getNome());
            System.out.println("  Fome: " + pet.getFome() + "/100");
            System.out.println("  Energia: " + pet.getEnergia() + "/100");
            System.out.println("  Humor: " + pet.getHumor());
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("3 - Colocar para Dormir");
            System.out.println("4 - Ver Apenas Status");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma ação: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade de comida: ");
                    int comida = scanner.nextInt();
                    pet.alimentar(comida);
                    break;
                case 2:
                    System.out.print("Tempo de brincadeira (minutos): ");
                    int minutos = scanner.nextInt();
                    pet.brincar(minutos);
                    break;
                case 3:
                    System.out.print("Horas de sono: ");
                    int horas = scanner.nextInt();
                    pet.dormir(horas);
                    break;
                case 4:
                    System.out.println("\nExibindo status atualizados acima...");
                    break;
                case 5:
                    System.out.println("\nAté logo! O " + pet.getNome() + " vai sentir sua falta.");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }

        scanner.close();
    }
}