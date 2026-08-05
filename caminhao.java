public class caminhao {
    public String tam_bau;
    public String num_eixos;
    public String suspensao;
    public String carroceria;
    // Constructor
    public caminhao(String tam_bau, String num_eixos, String suspensao, String carroceria) {
        this.tam_bau = tam_bau;
        this.num_eixos = num_eixos;
        this.suspensao = suspensao;
        this.carroceria = carroceria;
    }
    // Methods
    public String DescarregarPacote() {
        return "Descarregando...";
    }

    public String DarSeta() {
        return ">>>>>>";
    }

    @Override
    public String toString() {
        return "caminhao:" +
                "tamanho bau='" + tam_bau + '\'' +
                ",eixos='" + num_eixos + '\'' +
                ", Suspensao=" + suspensao +
                ", carroceria='" + carroceria + '\'' +
                '}';
    }
}





