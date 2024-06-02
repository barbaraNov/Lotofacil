import java.util.Scanner;

public class CadastraAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um vetor de objetos Aluno com capacidade para armazenar até 5 alunos.
        Aluno[] alunos = new Aluno[5];

        // Solicitar ao usuário que insira o nome e a idade de cada aluno.
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do aluno " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

            // Armazenar os alunos no vetor de objetos.
            alunos[i] = new Aluno(nome, idade);
        }

        // Exibir na tela os dados de todos os alunos cadastrados.
        System.out.println("\nAlunos cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        scanner.close();
    }
}
