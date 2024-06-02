public class TestaEstudante {
    public static void main(String[] args) {

            Estudante[] estudantes = {
                    new Estudante("Akisa", 8.5),
                    new Estudante("Mauriane", 7.0),
                    new Estudante("Genilson", 9.2),
                    new Estudante("Leandro", 6.8)
            };

            double media = Estudante.calcularMedia(estudantes);
            System.out.println("A média das notas é: " + media);
        }
    }
