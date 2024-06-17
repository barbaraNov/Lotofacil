public class ItemPedido {
        private Jogo jogo;
        private int quantidade;

        public ItemPedido(Jogo jogo, int quantidade) {
            this.jogo = jogo;
            this.quantidade = quantidade;
        }

        public Jogo getJogo() { return jogo; }
        public void setJogo(Jogo jogo) { this.jogo = jogo; }

        public int getQuantidade() { return quantidade; }
        public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

        @Override
        public String toString() {
            return quantidade + " x " + jogo.getTitulo();
        }
    }


