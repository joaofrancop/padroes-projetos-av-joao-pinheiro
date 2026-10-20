public class ComprovanteMatriculaBrasil implements ComprovanteMatricula {
    @Override
    public void gerar(String nomeAluno, String identificacao) {
        System.out.println("Comprovante de matricula - " + nomeAluno + ", CPF " + identificacao);
    }

    @Override
    public String getDescricao() {
        return "Comprovante de matricula com CPF (Brasil)";
    }
}
