public class Main {
    public static void main(String[] args) {
        System.out.println("Q1 - Emissao de Passagens\n");

        EmissorPassagem emissorAereo = new EmissorPassagemAerea("Ana Souza", 900.0);
        emissorAereo.emitir();

        EmissorPassagem emissorRodoviario = new EmissorPassagemRodoviaria("Bruno Lima", 150.0);
        emissorRodoviario.emitir();

        EmissorPassagem emissorFerroviario = new EmissorPassagemFerroviaria("Carla Rocha", 180.0);
        emissorFerroviario.emitir();
    }
}
