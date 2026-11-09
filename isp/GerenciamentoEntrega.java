package isp;

import srp.Pedido; // Importa o Pedido da pasta srp

public interface GerenciamentoEntrega {
    void atribuirEntrega(Pedido pedido, String entregador);
}