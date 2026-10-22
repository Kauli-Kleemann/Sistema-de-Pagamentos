public class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        // juros de 2%
        double total = valor * 1.02;
        System.out.println("Processando pagamento de R$ " + total + " via Cartão de Crédito (aplicado juros de 2%)...");
        System.out.println("Verificando limite e validando dados do cartão.");
        System.out.println("Pagamento aprovado!\n"); 
    }
}