public class Main {
    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new BrasilMatriculaFactory());
        matriculaBrasil.confirmarMatricula();

        Matricula matriculaChile = new Matricula(new ChileMatriculaFactory());
        matriculaChile.confirmarMatricula();
    }
}
