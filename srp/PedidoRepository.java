package srp;

// Classe com a responsabilidade única de salvar os dados
public class PedidoRepository {
    public void salvar(Pedido pedido) {
        System.out.println("A salvar pedido " + pedido.getId() + " no banco de dados...");
    }
}