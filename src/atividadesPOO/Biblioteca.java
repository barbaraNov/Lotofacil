import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
    }

    public String emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    livro.setDisponivel(false);
                    return "Livro '" + titulo + "' emprestado com sucesso.";
                } else {
                    return "Livro '" + titulo + "' já está emprestado.";
                }
            }
        }
        return "Livro '" + titulo + "' não encontrado.";
    }

    public String devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!livro.isDisponivel()) {
                    livro.setDisponivel(true);
                    return "Livro '" + titulo + "' devolvido com sucesso.";
                } else {
                    return "Livro '" + titulo + "' não estava emprestado.";
                }
            }
        }
        return "Livro '" + titulo + "' não encontrado.";
    }

    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }

    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }
}