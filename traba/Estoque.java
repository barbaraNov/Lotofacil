import java.util.HashMap;
import java.util.Map;

    public class Estoque {
        private Map<Jogo, Integer> estoque;

        public Estoque() {
            this.estoque = new HashMap<>();
        }

        public void adicionarJogo(Jogo jogo, int quantidade) {
            int quantidadeAtual = estoque.getOrDefault(jogo, 0);
            estoque.put(jogo, quantidadeAtual + quantidade);
        }

        public boolean removerJogo(Jogo jogo, int quantidade) {
            int quantidadeAtual = estoque.getOrDefault(jogo, 0);
            if (quantidadeAtual >= quantidade) {
                estoque.put(jogo, quantidadeAtual - quantidade);
                return true;
            } else {
                return false;
            }
        }

        public int verificarQuantidade(Jogo jogo) {
            return estoque.getOrDefault(jogo, 0);
        }

        public void listarJogos() {
            for (Map.Entry<Jogo, Integer> entry : estoque.entrySet()) {
                Jogo jogo = entry.getKey();
                int quantidade = entry.getValue();
                System.out.println("Jogo: " + jogo.getTitulo() + ", Quantidade: " + quantidade);
            }
        }

        public boolean estaEmEstoque(Jogo jogo) {
            return estoque.getOrDefault(jogo, 0) > 0;
        }
    }

