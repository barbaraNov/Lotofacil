public class TestaLivros {
    public static void main(String[] args) {
        Livro[] livros = {
                new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 3),
                new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 5),
                new Livro("O Código Da Vinci", "Dan Brown", 2),
                new Livro("A Culpa é das Estrelas", "John Green", 4)
        };

        // Verificar disponibilidade de um livro
        String tituloParaVerificar = "Harry Potter e a Pedra Filosofal";
        boolean disponivel = Livro.verificarDisponibilidade(livros, tituloParaVerificar);
        System.out.println("O livro '" + tituloParaVerificar + "' está disponível? " + disponivel);

        // Emprestar um livro
        String tituloParaEmprestar = "O Senhor dos Anéis";
        boolean emprestado = Livro.emprestarLivro(livros, tituloParaEmprestar);
        if (emprestado) {
            System.out.println("O livro '" + tituloParaEmprestar + "' foi emprestado com sucesso.");
        } else {
            System.out.println("O livro '" + tituloParaEmprestar + "' não está disponível para empréstimo.");
        }

        // Verificar novamente a disponibilidade após o empréstimo
        disponivel = Livro.verificarDisponibilidade(livros, tituloParaEmprestar);
        System.out.println("O livro '" + tituloParaEmprestar + "' está disponível? " + disponivel);
    }
}