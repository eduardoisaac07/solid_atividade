package srp;

import java.util.ArrayList;
import java.util.List;
import lsp.Produto; // Importa o Produto da pasta lsp

public class Pedido {
    private String id;
    private List<Produto> itens = new ArrayList<>();

    public Pedido(String id) {
        this.id = id;
    }

    public void adicionarItem(Produto produto) {
        this.itens.add(produto);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Produto::getPreco).sum();
    }

    public String getId() { return id; }
    public List<Produto> getItens() { return itens; }
}