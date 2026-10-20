public class ChileMatriculaFactory implements MatriculaFactory {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalChile();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoChile();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteMatriculaChile();
    }
}
