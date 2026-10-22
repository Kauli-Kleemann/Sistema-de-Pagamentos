public class Boleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$ " + valor + "...");
        System.out.println("Aguardando compensação bancária (até 3 dias úteis).");
        System.out.println("Pagamento será confirmado após o vencimento/pagamento.\n");
    }
}