public class App {
    public static void main(String[] args) {

        Pagamento paypal = new PayPal();
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new Boleto();

        paypal.processarPagamento(180.00);
        boleto.processarPagamento(27.89);
        cartao.processarPagamento(16.99);
    }
}