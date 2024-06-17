public class Pagamento {
        private String metodo;
        private double valor;

        public Pagamento(String metodo, double valor) {
            this.metodo = metodo;
            this.valor = valor;
        }

        public String getMetodo() { return metodo; }
        public void setMetodo(String metodo) { this.metodo = metodo; }

        public double getValor() { return valor; }
        public void setValor(double valor) { this.valor = valor; }

        @Override
        public String toString() {
            return "Pagamento de R$ " + valor + " usando " + metodo;
        }
    }


