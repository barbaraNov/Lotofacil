public class PacoteSimples extends Pacote {
    public PacoteSimples(){
        super();
    }
    @Override
   double calcularcustoenvio() {

        return 3.0 +(2.0 * PesoPacote);
    }
}
