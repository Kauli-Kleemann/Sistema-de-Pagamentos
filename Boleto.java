public class Boleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        // desconto de 5% por pagar à vista
        double total = valor * 0.95;
        System.out.printf("Gerando boleto no valor de R$ %.2f (aplicado desconto de 5%% por pagar à vista)...%n", total);
        System.out.println("Aguardando compensação bancária (até 3 dias úteis).");
        System.out.println("Pagamento será confirmado após o vencimento/pagamento.\n");
    }
}