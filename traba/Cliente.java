public class Cliente extends Pessoa {
    private String nomeCliente;
    private int telefoneCliente;
    private int emailCliente;

    public Cliente(String nome, String email, String telefone, String nomeCliente, int telefoneCliente, int emailCliente) {
        super(nome, email, telefone);
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public int getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(int emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", telefoneCliente=" + telefoneCliente +
                ", emailCliente=" + emailCliente +
                '}';
    }
}






