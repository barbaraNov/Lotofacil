import java.util.List;

    public class Loja {
        private String nome;
        private List<Jogo> estoque;

        public Loja(String nome, List<Jogo> estoque) {
            this.nome = nome;
            this.estoque = estoque;
        }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public List<Jogo> getEstoque() { return estoque; }
        public void setEstoque(List<Jogo> estoque) { this.estoque = estoque; }

        @Override
        public String toString() {
            return nome + " com " + estoque.size() + " jogos.";
        }
    }


