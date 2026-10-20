public class PassagemRodoviaria implements Passagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    public PassagemRodoviaria(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    public String getModal() {
        return "Rodoviario";
    }

    @Override
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    @Override
    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.03;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto";
    }
}
