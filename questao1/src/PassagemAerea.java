public class PassagemAerea implements Passagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    public PassagemAerea(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    public String getModal() {
        return "Aereo";
    }

    @Override
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    @Override
    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.08;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto e bilhete eletronico (e-ticket)";
    }
}
