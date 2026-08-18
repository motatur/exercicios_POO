public class Pet {
    // Atributos
    private String nome;
    private int fome;
    private int energia;

    // Construtor
    public Pet(String nome) {
        this.nome = nome;
        this.fome = 0;       
        this.energia = 100;  
    }

    // Getters e Setters validados
    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        if (fome < 0) {
            this.fome = 0;
        } else if (fome > 100) {
            this.fome = 100;
        } else {
            this.fome = fome;
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }


    public String getHumor() {
        if (fome > 70 || energia < 30) {
            return "Irritado / Cansado";
        } else if (fome < 30 && energia > 70) {
            return "Muito Feliz";
        } else {
            return "Neutro";
        }
    }
}