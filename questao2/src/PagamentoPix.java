public class PagamentoPix implements Pagamento {
    @Override
    public void processar(double valorMatricula) {
        System.out.println("Pagamento Pix - debito de R$ " + String.format("%.2f", valorMatricula));
    }

    @Override
    public String getDescricao() {
        return "Pagamento via Pix (Brasil)";
    }
}
