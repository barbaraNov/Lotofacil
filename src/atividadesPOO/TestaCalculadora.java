public class TestaCalculadora {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 20.0;

        System.out.println("Testando Calculadora:");
        System.out.println(a + " + " + b + " = " + Calculadora.somar(a, b));
        System.out.println(a + " - " + b + " = " + Calculadora.subtrair(a, b));
        System.out.println(a + " * " + b + " = " + Calculadora.multiplicar(a, b));
        System.out.println(a + " / " + b + " = " + Calculadora.dividir(a, b));

    }
}