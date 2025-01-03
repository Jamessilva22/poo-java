public class BoletoMetodo implements MetodoPagamentoInterface {
    double valorPagamento = 10.22;
    String metodoPagamento = "Boleto";

    public BoletoMetodo(double valorPagamento, String metodoPagamento){
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
    }

    @Override
    public double valorCobranca(){
        return valorPagamento;
    }
    @Override
    public String metodoCobranca(){
        return metodoPagamento;
    }
}
