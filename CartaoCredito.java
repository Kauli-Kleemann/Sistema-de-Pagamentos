public class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + "...");
        System.out.println("Verificando limite e validando dados do cartão.");
        System.out.println("Pagamento aprovado!\n"); 
    }
}