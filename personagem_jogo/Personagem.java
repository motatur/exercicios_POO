public class Personagem {
    // Atributos privados 
    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    // Construtor
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;    // Começa com a vida cheia
        this.energia = 100; // Começa com a energia cheia
        this.nivel = 1;     // O nível começa em 1
    }

    // Getters permitidos
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }

    

    public void receberDano(int dano) {
        if (dano > 0) {
            this.vida -= dano;
            
            //
            if (this.vida < 0) {
                this.vida = 0;
            }
            
            System.out.println(nome + " recebeu " + dano + " de dano! Vida atual: " + this.vida);
        }
    }

    public void descansar(int quantidade) {
        
        if (this.vida == 0) {
            System.out.println(nome + " está derrotado e não pode descansar.");
            return;
        }

        if (quantidade > 0) {
            this.energia += quantidade;
            
            // A energia não pode ultrapassar 100
            if (this.energia > 100) {
                this.energia = 100;
            }
            
            System.out.println(nome + " descansou e agora tem " + this.energia + " de energia.");
        }
    }

    public void atacar(int custoEnergia) {
        
        if (this.vida == 0) {
            System.out.println(nome + " está derrotado e não pode atacar.");
            return;
        }

        if (custoEnergia <= 0) {
            System.out.println("O custo de energia do ataque deve ser positivo.");
        } else if (this.energia >= custoEnergia) {
            this.energia -= custoEnergia;
            System.out.println(nome + " realizou um ataque! Energia restante: " + this.energia);
        } else {
            System.out.println(nome + " não tem energia suficiente para atacar! (Energia necessária: " 
                               + custoEnergia + ", Energia atual: " + this.energia + ")");
        }
    }


    public String getStatus() {
        if (this.vida == 0) {
            return "Derrotado";
        } else {
            return "Vivo";
        }
    }
}