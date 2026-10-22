public class PayPal implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        // taxa fixa de 2 reais
        double total = valor + 2.00;
        System.out.printf("Processando pagamento de R$ %.2f via PayPal (aplicada taxa fixa de R$ 2,00)...%n", total);
        System.out.println("Autenticando conta PayPal do usuário.");
        System.out.println("Pagamento aprovado!\n");
    }
}