public class PayPal implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via Paypal...");
        System.out.println("Autenticando conta PayPal do usuário.");
        System.out.println("Pagamento aprovado!\n");
    }
}