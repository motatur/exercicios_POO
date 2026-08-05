import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  um array para armazenar os 10 objetos
        Carros[] listaDeCarros = new Carros[10];

        // par ler os dados dos 10 carros
        for (int i = 0; i < 10; i++) {
            System.out.println("\n - Cadastro do Carro " + (i + 1) + " -");

            System.out.print("Arcondicionado (ex: Frio ou Quente): ");
            String ar = scanner.nextLine();

            System.out.print("PortaMalas (ex: 200l): ");
            String mala = scanner.nextLine();

            System.out.print("Som (ex sony): ");
            String som = scanner.nextLine();

            System.out.print("Número de Portas: ");
            int portas = scanner.nextInt();
            scanner.nextLine(); 

            //  dados digitados e guarda no array
            listaDeCarros[i] = new Carros(ar, mala, som, portas);
        }

        //printa tudo
        System.out.println("\n= Exibindo dados dos carros cadastrados =");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nCarro " + (i + 1) + ":");
            System.out.println("Arcondicionado: " + listaDeCarros[i].Arcondicionado);
            System.out.println("PortaMalas: " + listaDeCarros[i].PortaMalas);
            System.out.println("Som: " + listaDeCarros[i].Som);
            System.out.println("Portas: " + listaDeCarros[i].NumeroDePortas);
        }

        scanner.close();
    }
}
