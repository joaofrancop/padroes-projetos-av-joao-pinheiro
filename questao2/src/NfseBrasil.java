public class NfseBrasil implements DocumentoFiscal {
    @Override
    public void emitir(double valorMatricula) {
        double iss = valorMatricula * 0.05;
        System.out.println("Documento fiscal NFS-e - valor R$ "
            + String.format("%.2f", valorMatricula) + ", ISS 5%: R$ "
            + String.format("%.2f", iss));
    }

    @Override
    public String getDescricao() {
        return "NFSe Brasil - ISS 5%";
    }
}
