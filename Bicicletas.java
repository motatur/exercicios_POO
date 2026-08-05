public class Bicicletas {
    public String marca;
    public String aro;
    public String tipo_freio;
    public String tipo_cubo;
    // Constructor
    public Bicicletas(String marca, String aro, String tipo_freio, String tipo_cubo) {
        this.marca = marca;
        this.aro = aro;
        this.tipo_freio = tipo_freio;
        this.tipo_cubo = tipo_cubo;
    }
    // Methods
    public String Compra() {
        return "Compra efetuada com sucesso.";
    }

    public String abrir() {
        return "Livro aberto.";
    }

    @Override
    public String toString() {
        return "Bike:" +
                "marca='" + marca + '\'' +
                ",freio='" + tipo_freio + '\'' +
                ", aro=" + aro +
                ", cubo='" + tipo_cubo + '\'' +
                '}';
    }
}





