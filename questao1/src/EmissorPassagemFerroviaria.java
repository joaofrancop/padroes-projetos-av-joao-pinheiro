public class EmissorPassagemFerroviaria extends EmissorPassagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    public EmissorPassagemFerroviaria(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    protected Passagem criarPassagem() {
        return new PassagemFerroviaria(nomePassageiro, valorTarifa);
    }
}
