import java.util.List;

public interface Passagem {
    String getModal();
    String getNomePassageiro();
    double calcularTaxaEmbarque();
    List<String> getDocumentosExigidos();
}
