public class PixMetodo implements MetodoPagamentoInterface{
    double valorPagamento = 32.50;
    String metodoPagamento = "Pix";

    @Override
    public double valorCobranca(){
        return valorPagamento;
    }
    public String metodoCobranca(){
        return metodoPagamento;
    }

}
