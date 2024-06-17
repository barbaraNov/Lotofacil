public class Vendedor extends Pessoa {
    private double salario;

    public Vendedor(String nome, String email, String telefone, double salario) {
        super(nome, email, telefone);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "salario=" + salario +
                '}';
    }
}