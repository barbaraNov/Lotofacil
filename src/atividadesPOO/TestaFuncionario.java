
public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = new Funcionario("Lara", 2920, "RH");
        funcionarios[1] = new Funcionario("Luan", 2300, "comercial");
        funcionarios[2] = new Funcionario("Vitoria", 2920, "RH");
        funcionarios[3] = new Funcionario("Ísis", 3430, "financeiro");
        funcionarios[4] = new Funcionario("Brenda", 2930, "RH");

        System.out.println("Salários antes do aumento:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        // Aumentar o salário dos funcionários do departamento "comercial"
        aumentarSalario(funcionarios, "RH");

        System.out.println("\nSalários após o aumento no departamento 'RH':");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public static void aumentarSalario(Funcionario[] funcionarios, String departamento) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDepartamento().equalsIgnoreCase(departamento)) {
                funcionario.setSalario(funcionario.getSalario() * 1.10);
            }
        }
    }
}