public class BoletaElectronicaChile implements DocumentoFiscal {
    @Override
    public void emitir(double valorMatricula) {
        double iva = valorMatricula * 0.19;
        System.out.println("Documento fiscal boleta electronica - valor CLP "
            + String.format("%.2f", valorMatricula) + ", IVA 19%: CLP "
            + String.format("%.2f", iva));
    }

    @Override
    public String getDescricao() {
        return "Boleta electronica Chile - IVA 19%";
    }
}
