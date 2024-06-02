public class TestaProduto {
    public static void main(String[] args) {
        Produto produto[] = new Produto[10];
        produto[0] = new Produto("arroz", 32.90);
        produto[1] = new Produto("farinha", 4.98);
        produto[2] = new Produto("couve", 3.50);
        produto[3] = new Produto("suco", 7.89);
        produto[4] = new Produto("macarrão", 3.90);
        produto[5] = new Produto("lampada", 7.58);
        produto[6] = new Produto("laranja", 2.99);
        produto[7] = new Produto("detergente", 1.98);
        produto[8] = new Produto("açucar", 14.78);
        produto[9] = new Produto("guardanapo", 1.20);


        double soma = 0;
        for( Produto produto1 : produto) {
            soma += produto1.getPreco();
        }
        double media = soma;

     System.out.println("media dos preços: "+ soma);
       }
 }

