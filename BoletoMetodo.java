public class BoletoMetodo implements MetodoPagamentoInterface {
    double valorPagamento;
    String metodoPagamento = "Boleto";

    public BoletoMetodo(double valorPagamento){
        this.valorPagamento = valorPagamento;
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
