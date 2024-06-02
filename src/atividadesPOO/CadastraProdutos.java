import java.util.Scanner;

public class CadastraProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um vetor de objetos Produto com capacidade para armazenar até 3 produtos.
        Produtos[] produtos = new Produtos[3];

        // Solicitar ao usuário que insira o nome, o preço e a quantidade de cada produto.
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço do produto " + (i + 1) + ": ");
            double preco = scanner.nextDouble();

            System.out.println("Digite a quantidade do produto " + (i + 1) + ": ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

            // Armazenar os produtos no vetor de objetos.
            produtos[i] = new Produtos(nome, preco);
        }

        // Exibir na tela os dados de todos os produtos cadastrados.
        System.out.println("\nProdutos cadastrados:");
        for (Produtos produto : produtos) {
            System.out.println(produto);
        }

        // Encontrar e imprimir o produto com o maior valor total.
        Produtos maiorValorProduto = produtos[0];
        double somaValoresTotais = 0;
        for (Produtos produto : produtos) {
            if (produto.getValorTotal() > maiorValorProduto.getValorTotal()) {
                maiorValorProduto = produto;
            }
            somaValoresTotais += produto.getValorTotal();
        }

        System.out.println("\nProduto com maior valor total:");
        System.out.println(maiorValorProduto);

        // Calcular e imprimir a média dos valores totais.
        double mediaValoresTotais = somaValoresTotais / produtos.length;
        System.out.println("\nMédia dos valores totais: " + mediaValoresTotais);

        scanner.close();
    }
}
