import java.util.Locale;

public abstract class EmissorPassagem {

    protected abstract Passagem criarPassagem(String nomePassageiro, double valorTarifa);

    public void emitirPassagem(String nomePassageiro, double valorTarifa) {
        Passagem passagem = criarPassagem(nomePassageiro, valorTarifa);
        double taxaEmbarque = passagem.calcularTaxaEmbarque();

        System.out.println("=== Resumo da Passagem ===");
        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Nome do passageiro: " + passagem.getNomePassageiro());
        System.out.printf(Locale.forLanguageTag("pt-BR"), "Taxa de embarque: R$ %.2f%n", taxaEmbarque);
        System.out.println("Documentos exigidos: " + passagem.getDocumentosExigidos());
        System.out.println();
    }
}
