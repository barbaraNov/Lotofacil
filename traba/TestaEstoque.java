public class TestaEstoque {
    public static void main(String[] args) {
                Estoque estoque = new Estoque();

                Jogo jogo1 = new Jogo(1, "TCrossFire");
                Jogo jogo2 = new Jogo(2, "Minecraft");

                estoque.adicionarJogo(jogo1, 10);
                estoque.adicionarJogo(jogo2, 5);

                System.out.println("Quantidade de TCrossFire: " + estoque.verificarQuantidade(jogo1));
                System.out.println("Quantidade de Minecraft: " + estoque.verificarQuantidade(jogo2));

                estoque.listarJogos();

                boolean removido = estoque.removerJogo(jogo1, 2);
                if (removido) {
                    System.out.println("2 unidades de TCrossFire 3 removidas do estoque.");
                } else {
                    System.out.println("Não há unidades suficientes de TCrossFire no estoque.");
                }

                System.out.println("Quantidade TCrossFire: " + estoque.verificarQuantidade(jogo1));
            }
        }