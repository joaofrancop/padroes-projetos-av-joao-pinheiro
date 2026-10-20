import java.util.Arrays;
import java.util.List;

public class PassagemFerroviaria implements Passagem {
    private String nomePassageiro;
    private double valorTarifa;

    public PassagemFerroviaria(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    public String getModal() {
        return "Ferroviario";
    }

    @Override
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    @Override
    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.05;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList(
            "documento de identidade com foto",
            "comprovante de reserva"
        );
    }
}
