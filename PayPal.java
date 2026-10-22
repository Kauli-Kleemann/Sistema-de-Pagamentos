public class PayPal implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        // taxa fixa de 2 reais
        double total = valor + 2.00;
        System.out.println("Processando pagamento de R$ " + total + " via Paypal (aplicada taxa fixa de R$ 2,00)...");
        System.out.println("Autenticando conta PayPal do usuário.");
        System.out.println("Pagamento aprovado!\n");
    }
}