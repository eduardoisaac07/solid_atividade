package dip;

// Classe de alto nível que depende apenas do contrato (Interface Notificador)
public class ServicoNotificacao {
    private final Notificador notificador;

    // Injeção de Dependência via Construtor
    public ServicoNotificacao(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificarCliente(String mensagem) {
        this.notificador.enviar(mensagem);
    }
}