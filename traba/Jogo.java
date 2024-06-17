public class Jogo {
    private double idJogo;
    private String titulo;



    public Jogo(double idJogo, String titulo) {
        this.idJogo = idJogo;
        this.titulo =  titulo;
    }

    public double getIdJogo() {
        return idJogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setIdJogo(double idJogo) {
        this.idJogo = idJogo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "idJogo=" + idJogo +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
