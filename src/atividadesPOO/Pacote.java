import jdk.jshell.PersistentSnippet;

public class Pacote {
    protected double PesoPacote;
    public Pacote(){
        this.PesoPacote= PesoPacote;
    }
    double calcularcustoenvio(){
       return  0;
    }
    public static void main(String[] args) {
        // instâncias de cada tipo de pacote
        Pacote pacote1 = new PacoteSimples();
        Pacote pacote2 = new PacoteExpresso();

        System.out.println("Custo de envio do pacote simples: R$ = " + pacote1.calcularcustoenvio());
        System.out.println("Custo de envio do pacote expresso: R$ = " + pacote2.calcularcustoenvio());
    }
}

