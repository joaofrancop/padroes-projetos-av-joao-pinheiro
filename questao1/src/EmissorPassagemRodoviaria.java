public class EmissorPassagemRodoviaria extends EmissorPassagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    public EmissorPassagemRodoviaria(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    protected Passagem criarPassagem() {
        return new PassagemRodoviaria(nomePassageiro, valorTarifa);
    }
}
