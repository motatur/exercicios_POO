public class Motos {
    public String marca;
    public String cilindrada;
    public String raios;
    public String carenagem;
    // Construtor
    public Motos(String marca, String cilindrada, String raios, String carenagem) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.raios = raios;
        this.carenagem = carenagem;
    }
    // Meto
    public String acelerar() {
        return "8mil giros";
    }

    public String frear() {
        return "Freando. (!)";
    }

    @Override
    public String toString() {
        return "Motos:" +
                "marca='" + marca + '\'' +
                ",raios='" + raios + '\'' +
                ", preco=" + cilindrada +
                ", carenagem='" + carenagem + '\'' +
                '}';
    }
}





