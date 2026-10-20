public class EmissorPassagemAerea extends EmissorPassagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    public EmissorPassagemAerea(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    protected Passagem criarPassagem() {
        return new PassagemAerea(nomePassageiro, valorTarifa);
    }
}
