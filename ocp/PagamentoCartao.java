package ocp;

// Implementação Cartão
public class PagamentoCartao implements FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via Cartão no valor de R$ " + valor);
    }
}