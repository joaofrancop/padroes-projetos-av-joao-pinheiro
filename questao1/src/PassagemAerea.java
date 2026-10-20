import java.util.Arrays;
import java.util.List;

public class PassagemAerea implements Passagem {
    private String nomePassageiro;
    private double valorTarifa;

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
    public List<String> getDocumentosExigidos() {
        return Arrays.asList(
            "documento de identidade com foto",
            "bilhete eletrônico (e-ticket)"
        );
    }
}
