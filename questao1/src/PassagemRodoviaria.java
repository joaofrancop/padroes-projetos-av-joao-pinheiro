import java.util.Arrays;
import java.util.List;

public class PassagemRodoviaria implements Passagem {
    private String nomePassageiro;
    private double valorTarifa;

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
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("documento de identidade com foto e comprovante de reserva");
    }
}
