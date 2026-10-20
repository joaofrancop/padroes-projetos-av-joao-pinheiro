public class ComprovanteMatriculaChile implements ComprovanteMatricula {
    @Override
    public void gerar(String nomeAluno, String identificacao) {
        System.out.println("Comprovante de matricula - " + nomeAluno + ", RUT " + identificacao);
    }

    @Override
    public String getDescricao() {
        return "Comprovante de matricula com RUT (Chile)";
    }
}
