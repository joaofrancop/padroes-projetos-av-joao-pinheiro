public class MatriculaChileFactory implements MatriculaFactory {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new BoletaElectronicaChile();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoWebpay();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteMatriculaChile();
    }
}
