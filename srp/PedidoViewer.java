package srp;

import lsp.Produto; // Importa o Produto da pasta lsp

public class PedidoViewer {
    public void exibir(Pedido pedido) {
        System.out.println("=== Detalhes do Pedido: " + pedido.getId() + " ===");
        for (Produto item : pedido.getItens()) {
            System.out.println("- " + item.getNome() + ": R$ " + item.getPreco());
        }
        System.out.println("Total: R$ " + pedido.calcularTotal());
    }
}