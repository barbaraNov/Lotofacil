public class Carrinho{
    private String totalCarrinho;

    public Carrinho(double idJogo, String titulo, String totalCarrinho) {
        this.totalCarrinho = totalCarrinho;
    }

    public String getTotalCarrinho() {
        return totalCarrinho;
    }

    public void setTotalCarrinho(String totalCarrinho) {
        this.totalCarrinho = totalCarrinho;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "totalCarrinho='" + totalCarrinho + '\'' +
                '}';
    }
}
