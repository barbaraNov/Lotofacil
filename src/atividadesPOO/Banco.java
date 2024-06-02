import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(int numero, String titular, double saldo) {
        Conta conta = new Conta(numero, titular);
        contas.add(conta);
    }

    public boolean depositar(int numero, double valor) {
        Conta conta = buscarConta(numero);
        if (conta != null) {
            conta.depositar(valor);
            return true;
        }
        return false;
    }

    public boolean sacar(int numero, double valor) {
        Conta conta = buscarConta(numero);
        if (conta != null) {
            return conta.sacar(valor);
        }
        return false;
    }

    public boolean transferir(int numeroOrigem, int numeroDestino, double valor) {
        Conta contaOrigem = buscarConta(numeroOrigem);
        Conta contaDestino = buscarConta(numeroDestino);
        if (contaOrigem != null && contaDestino != null && contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    public List<Conta> listarContas() {
        return new ArrayList<>(contas);
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}