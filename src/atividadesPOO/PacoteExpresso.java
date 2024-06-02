public class PacoteExpresso  extends Pacote{
    PacoteExpresso(){
        super();
    }
    @Override
    double calcularcustoenvio() {
        return 8.0 + (0.2 * PesoPacote);
        }
    }
