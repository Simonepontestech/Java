package ExercicioUni1;

public class AppExer {
    public static void main(String[] args) {
        System.out.println("Funcionário sem valor base: ");
        FuncionarioComissionado f1 = new FuncionarioComissionado("Simone", 74755, 10, 50000);
        System.out.println("Salário: "+ f1.getSalario());

        System.out.println("Funcionário com valor base: ");
        FuncionariosComissionadoBase f2 = new FuncionariosComissionadoBase("Simone", 71142, 10, 50000, 1100);
        System.out.println("Salário: "+ f2.getSalario());

    }
}
