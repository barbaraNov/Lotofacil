public class TestaLivro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro("Cinderela", "Charles Perrault");
        biblioteca.adicionarLivro("Extraordinario", "R.J Palacio");
        biblioteca.adicionarLivro("diario de um banana", " Jff Kinney");

        System.out.println("Todos os livros na biblioteca:");
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }

        System.out.println("\nEmprestando 'cinderela':");
        System.out.println(biblioteca.emprestarLivro("Cinderela"));

        System.out.println("\nTentando emprestar 'Cinderela' novamente:");
        System.out.println(biblioteca.emprestarLivro("1984"));

        System.out.println("\nLivros disponíveis na biblioteca:");
        for (Livro livro : biblioteca.listarLivrosDisponiveis()) {
            System.out.println(livro);
        }

        System.out.println("\nDevolvendo 'Cinderela':");
        System.out.println(biblioteca.devolverLivro("Cinderela"));

        System.out.println("\nLivros disponíveis na biblioteca após devolução:");
        for (Livro livro : biblioteca.listarLivrosDisponiveis()) {
            System.out.println(livro);
        }
    }
}