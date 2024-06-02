public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.adicionarConta(20, "Bárbara",5.600);
        banco.adicionarConta(21, "Beatriz",3.500);
        banco.adicionarConta(22, "Caio",2.700);

        System.out.println("Todas as contas no banco:");
        for (Conta conta : banco.listarContas()) {
            System.out.println(conta);
        }

        System.out.println("\nDepositando 100 na conta 22:");
        banco.depositar(22, 100);
        System.out.println(banco.buscarConta(22));

        System.out.println("\nSacando 110 da conta 20:");
        banco.sacar(20, 110);
        System.out.println(banco.buscarConta(20));
        System.out.println("\nTransferindo 10 da conta 21 para a conta 22:");
        banco.transferir(21, 22, 10);
        System.out.println(banco.buscarConta(21));
        System.out.println(banco.buscarConta(22));  

        System.out.println("\nTodas as contas no banco após operações:");
        for (Conta conta : banco.listarContas()) {
            System.out.println(conta);
        }
    }
}