import srp.Pedido;
import srp.PedidoRepository;
import srp.PedidoViewer;

import ocp.FormaPagamento;
import ocp.PagamentoPix;

import lsp.Produto;
import lsp.Pizza;
import lsp.Bebida;

import dip.Notificador;
import dip.WhatsAppNotificador;
import dip.ServicoNotificacao;

public class Main {
    public static void main(String[] args) {
        // Exemplo de execução usando as classes importadas dos seus pacotes
        Produto pizza = new Pizza("Calabresa", 45.0);
        Produto bebida = new Bebida("Refrigerante", 8.0);

        Pedido pedido = new Pedido("PED-001");
        pedido.adicionarItem(pizza);
        pedido.adicionarItem(bebida);

        PedidoViewer viewer = new PedidoViewer();
        viewer.exibir(pedido);

        PedidoRepository repo = new PedidoRepository();
        repo.salvar(pedido);

        FormaPagamento pagamento = new PagamentoPix();
        pagamento.processarPagamento(pedido.calcularTotal());

        Notificador notificador = new WhatsAppNotificador();
        ServicoNotificacao servicoNotificacao = new ServicoNotificacao(notificador);
        servicoNotificacao.notificarCliente("O seu pedido PED-001 foi efetuado com sucesso!");
    }
}