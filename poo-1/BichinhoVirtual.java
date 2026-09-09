public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int energia;

    public BichinhoVirtual(String nome) {
        this.nome = nome;
        this.fome = 0;
        this.energia = 100;
    }



    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getEnergia() {
        return energia;
    }



    public String getHumor() {

        if (this.fome >= 80 || this.energia <= 20) {
            return "Ruim";
        }

        else if (this.energia <= 50) {
            return "Neutro / Cansado";
        }

        else {
            return "Bom / Radiante";
        }
    }



    private int validarLimite(int valor) {
        if (valor < 0) return 0;
        if (valor > 100) return 100;
        return valor;
    }



    public void alimentar(int quantidade) {
        if (quantidade <= 0) return;
        this.fome = validarLimite(this.fome - quantidade);
        System.out.println(nome + " foi alimentado. Fome atual: " + this.fome);
    }

    public void brincar(int minutos) {
        if (minutos <= 0) return;
        this.fome = validarLimite(this.fome + (minutos * 2));
        this.energia = validarLimite(this.energia - (minutos * 3));
        System.out.println(nome + " brincou. Fome: " + getFome() + " | Energia: " + this.energia);
    }

    public void dormir(int horas) {
        if (horas <= 0) return;
        this.energia = validarLimite(this.energia + (horas * 15));
        System.out.println(nome + " descansou. Energia atual: " + this.energia);
    }
}