import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Pagamento pagamento;

    public Pedido(Cliente cliente, List<ItemPedido> itens, Pagamento pagamento) {
        this.cliente = cliente;
        this.itens = itens;
        this.pagamento = pagamento;
    }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public List<ItemPedido> getItens() { return itens; }
    public void setItens(List<ItemPedido> itens) { this.itens = itens; }

    public Pagamento getPagamento() { return pagamento; }
    public void setPagamento(Pagamento pagamento) { this.pagamento = pagamento; }

    @Override
    public String toString() {
        return "Pedido de " + cliente.getNome() + " com " + itens.size() + " itens.";
    }
}
