public class BoletoMetodo implements MetodoPagamentoInterface {
    double valorPagamento = 10.22;
    String metodoPagamento = "Boleto";

    @Override
    public double valorCobranca(){
        return valorPagamento;
    }
    @Override
    public String metodoCobranca(){
        return metodoPagamento;
    }
}
