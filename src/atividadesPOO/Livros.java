public class Livros {
        private String titulo;
        private String autor;
        private int quantidadeDisponivel;

        // Construtor
        public Livros(String titulo, String autor, int quantidadeDisponivel) {
            this.titulo = titulo;
            this.autor = autor;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }

        // Getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getQuantidadeDisponivel() {
            return quantidadeDisponivel;
        }

        // Método para emprestar um livro (diminuir a quantidade disponível)
        public static boolean emprestarLivro(Livro[] livros, String titulo) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    if (livro.getQuantidadeDisponivel() > 0) {
                        livro.quantidadeDisponivel--;
                        return true;
                    }
                    return false; // Livro não disponível
                }
            }
            return false; // Livro não encontrado
        }

        // Método para verificar a disponibilidade de um livro específico
        public static boolean verificarDisponibilidade(Livro[] livros, String titulo) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    return livro.getQuantidadeDisponivel() > 0;
                }
            }
            return false; // Livro não encontrado
        }
    }

