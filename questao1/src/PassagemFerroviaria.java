public class PassagemFerroviaria implements Passagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    public PassagemFerroviaria(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    public String getModal() {
        return "Ferroviario";
    }

    @Override
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    @Override
    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.05;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto e comprovante de reserva";
    }
}
