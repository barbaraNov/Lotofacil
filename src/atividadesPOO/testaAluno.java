public class testaAluno {
    public static void main(String[] args) {
        Aluno Aluno[] = new Aluno[5];
        Aluno[0] = new Aluno("Bárbara", 19);
        Aluno[1] = new Aluno("Beatriz", 20);
        Aluno[2] = new Aluno("Tiago", 18.9);
        Aluno[3] = new Aluno("Isabel", 19.8);
        Aluno[4] = new Aluno("Gabriella", 17.6);


        System.out.println("nome do aluno: "+ Aluno[4].getNome() + "\nNota do aluno: " + Aluno[4].getNota());

    }
}
