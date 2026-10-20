public class PagamentoWebpay implements Pagamento {
    @Override
    public void processar(double valorMatricula) {
        System.out.println("Pagamento Webpay - debito de CLP " + String.format("%.2f", valorMatricula));
    }

    @Override
    public String getDescricao() {
        return "Pagamento via Webpay (Chile)";
    }
}
