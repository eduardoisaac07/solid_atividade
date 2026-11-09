package ocp;

// Implementação Pix
public class PagamentoPix implements FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via PIX no valor de R$ " + valor);
    }
}