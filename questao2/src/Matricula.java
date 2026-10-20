public class Matricula {
    private final MatriculaFactory factory;

    public Matricula(MatriculaFactory factory) {
        this.factory = factory;
    }

    public void confirmarMatricula(double valor, String nomeAluno, String identificacao) {
        DocumentoFiscal documento = factory.criarDocumentoFiscal();
        Pagamento pagamento = factory.criarPagamento();
        ComprovanteMatricula comprovante = factory.criarComprovanteMatricula();

        documento.emitir(valor);
        pagamento.processar(valor);
        comprovante.gerar(nomeAluno, identificacao);

        imprimirRelatorio(documento, pagamento, comprovante);
    }

    private void imprimirRelatorio(
        DocumentoFiscal documento,
        Pagamento pagamento,
        ComprovanteMatricula comprovante
    ) {
        System.out.println("Relatorio da matricula");
        System.out.println("1. " + documento.getDescricao());
        System.out.println("2. " + pagamento.getDescricao());
        System.out.println("3. " + comprovante.getDescricao());
        System.out.println();
    }
}
