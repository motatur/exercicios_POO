public class Carros {
    public String Arcondicionado;
    public String PortaMalas;
    public String Som;
    public Integer NumeroDePortas;
    // Constructor
    public Carros(String Arcondicionado, String PortaMalas, String Som, Integer NumeroDePortas) {
        this.Arcondicionado = Arcondicionado;
        this.PortaMalas = PortaMalas;
        this.NumeroDePortas = NumeroDePortas;
        this.Som = Som;
    }
    // Methods
    public String EngatarFreioDeMao() {
        return " (!) Acionado " ;
    }

    public String LigarAr() {
        return "32 graus celsius";
    }

    @Override
    public String toString() {
        return "Carros:" +
                "ArCondicionado='" + Arcondicionado + '\'' +
                ",PortaMalas='" + PortaMalas + '\'' +
                ", Som =" + Som +
                ", NumeroDePortas='" + NumeroDePortas + '\'' +
                '}';
    }
}





