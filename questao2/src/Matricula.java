public class Matricula {
    private final MatriculaFactory factory;

    public Matricula(MatriculaFactory factory) {
        this.factory = factory;
    }

    public void confirmarMatricula() {
        DocumentoFiscal documentoFiscal = factory.criarDocumentoFiscal();
        Pagamento pagamento = factory.criarPagamento();
        ComprovanteMatricula comprovanteMatricula = factory.criarComprovanteMatricula();

        System.out.println("=== Relatório de Matrícula ===");
        System.out.println("Documento fiscal: " + documentoFiscal.getDescricao());
        System.out.println("Pagamento: " + pagamento.getDescricao());
        System.out.println("Comprovante de matrícula: " + comprovanteMatricula.getDescricao());
        System.out.println();
    }
}
