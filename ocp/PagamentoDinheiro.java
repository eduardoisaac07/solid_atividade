package ocp;

// Implementação Dinheiro
public class PagamentoDinheiro implements FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento em Dinheiro no valor de R$ " + valor);
    }
}