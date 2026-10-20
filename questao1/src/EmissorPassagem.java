public abstract class EmissorPassagem {

    protected abstract Passagem criarPassagem();

    public void emitir() {
        Passagem passagem = criarPassagem();
        double taxa = passagem.calcularTaxaEmbarque();
        imprimirResumo(passagem, taxa);
    }

    private void imprimirResumo(Passagem passagem, double taxaEmbarque) {
        System.out.println("--- Resumo da passagem ---");
        System.out.println("Modal            : " + passagem.getModal());
        System.out.println("Passageiro       : " + passagem.getNomePassageiro());
        System.out.println("Taxa de embarque : R$ " + String.format("%.2f", taxaEmbarque));
        System.out.println(
            "Documentos exigidos: " + String.join(", ", passagem.getDocumentosExigidos())
        );
        System.out.println();
    }
}
