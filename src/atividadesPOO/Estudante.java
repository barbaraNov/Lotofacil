public class Estudante {
    private String nome;
    private double nota;

    public Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public static double calcularMedia(Estudante[] estudantes) {
        double soma = 0.0;
        for (Estudante estudante : estudantes) {
            soma += estudante.getNota();
        }
        return soma / estudantes.length;
    }
}
