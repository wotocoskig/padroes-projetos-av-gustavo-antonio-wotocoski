public class Main {
    public static void main(String[] args) {
        EmissorPassagem emissorAereo = new EmissorPassagemAerea();
        EmissorPassagem emissorRodoviario = new EmissorPassagemRodoviaria();
        EmissorPassagem emissorFerroviario = new EmissorPassagemFerroviaria();

        emissorAereo.emitirPassagem("Ana Beatriz Costa", 1200.00);
        emissorRodoviario.emitirPassagem("Lucas Mendes", 250.00);
        emissorFerroviario.emitirPassagem("Fernanda Oliveira", 400.00);
    }
}
