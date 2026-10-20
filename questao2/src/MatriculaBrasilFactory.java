public class MatriculaBrasilFactory implements MatriculaFactory {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NfseBrasil();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteMatriculaBrasil();
    }
}
