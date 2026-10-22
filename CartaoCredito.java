public class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        // juros de 2%
        double total = valor * 1.02;
        System.out.printf("Processando pagamento de R$ %.2f via Cartão de Crédito (aplicado juros de 2%%)...%n", total);
        System.out.println("Verificando limite e validando dados do cartão.");
        System.out.println("Pagamento aprovado!\n"); 
    }
}