public class Avaliacao {
        private Jogo jogo;
        private Cliente cliente;
        private int nota;
        private String comentario;

        public Avaliacao(Jogo jogo, Cliente cliente, int nota, String comentario) {
            this.jogo = jogo;
            this.cliente = cliente;
            this.nota = nota;
            this.comentario = comentario;
        }

        public Jogo getJogo() { return jogo; }
        public void setJogo(Jogo jogo) { this.jogo = jogo; }

        public Cliente getCliente() { return cliente; }
        public void setCliente(Cliente cliente) { this.cliente = cliente; }

        public int getNota() { return nota; }
        public void setNota(int nota) { this.nota = nota; }

        public String getComentario() { return comentario; }
        public void setComentario(String comentario) { this.comentario = comentario; }

        @Override
        public String toString() {
            return nota + " estrelas para " + jogo.getTitulo() + " por " + cliente.getNome() + ": " + comentario;
        }
    }

