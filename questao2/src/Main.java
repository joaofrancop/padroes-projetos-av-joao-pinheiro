public class Main {
    public static void main(String[] args) {
        System.out.println("Q2 - Matriculas internacionais\n");

        Matricula matriculaBrasil = new Matricula(new MatriculaBrasilFactory());
        matriculaBrasil.confirmarMatricula(520.0, "Joao Pinheiro", "111.222.333-44");

        Matricula matriculaChile = new Matricula(new MatriculaChileFactory());
        matriculaChile.confirmarMatricula(95000.0, "Maria Gonzalez", "98.765.432-1");
    }
}
