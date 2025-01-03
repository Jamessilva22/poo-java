public class RetornandoValorMetodo {
    public static void main(String[] metodosdepagamento){
        // Cria um metodo de pagamento pix
        MetodoPagamentoInterface pagamentoPix = new PixMetodo(22.50);
        double valorPagamento = pagamentoPix.valorCobranca();
        String metodoPagamento = pagamentoPix.metodoCobranca();

        // Cria um pagamento por boleto:
        MetodoPagamentoInterface pagamentoBoleto = new BoletoMetodo(30.64);
        double valorPagamento2 = pagamentoBoleto.valorCobranca();
        String metodoPagamento2 = pagamentoBoleto.metodoCobranca();

        System.out.println("Seu pagamento de " + valorPagamento + " pago por " + metodoPagamento + " foi recebido!");
        System.out.println("Seu pagamento de " + valorPagamento2 + " pago por " + metodoPagamento2 + " foi recebido!");
    }
}
